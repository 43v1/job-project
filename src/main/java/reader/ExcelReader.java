package reader;

import model.Candidate;
import model.Job;

import java.io.IOException;
import java.util.List;

public interface ExcelReader {

    List<Candidate> readCandidates(String path) throws IOException;

    List<Job> readJobs(String path) throws IOException;

}
