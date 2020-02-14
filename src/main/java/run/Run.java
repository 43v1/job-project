package run;

import model.Candidate;
import model.Job;
import reader.ExcelReader;
import reader.ExcelReaderImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Run {

    private static String CANDIDATE_FILE_LOCATION = "src/main/resources/candidates.xlsx";
    private static String JOB_FILE_LOCATION = "src/main/resources/job.xlsx";

    public static void main(String[] args) throws IOException {
        ExcelReader excelReader = new ExcelReaderImpl();


        List<Job> jobs = excelReader.readJobs(JOB_FILE_LOCATION);
        List<Candidate> candidates = excelReader.readCandidates(CANDIDATE_FILE_LOCATION);

        Map<Candidate, List<Job>> map = new HashMap<>();
        for (Candidate candidate : candidates) {
            List<Job> suitableJobs = selectSuitableJobs(candidate, jobs);
            candidate.setSuitableJobs(suitableJobs);

            map.put(candidate, suitableJobs);
        }

        Set<Candidate> mapCandidates = map.keySet();
        mapCandidates.forEach(candidate -> {

        });
        System.out.println(1);

    }

    private static List<Job> selectSuitableJobs(Candidate candidate, List<Job> jobs) {
        if (null == jobs || jobs.size() == 0) {
            return null;
        }

        return jobs.stream()
                .filter(job -> job.getJob().equalsIgnoreCase(candidate.getJob()) &&
                        job.getJobCategory().equalsIgnoreCase(candidate.getJobCategory()) &&
                        job.getExperience().equalsIgnoreCase(candidate.getExperience()))
                .collect(Collectors.toList());
    }
}
