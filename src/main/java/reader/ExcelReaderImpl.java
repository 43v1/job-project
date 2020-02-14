package reader;

import model.Candidate;
import model.Job;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReaderImpl implements ExcelReader {

    @Override
    public List<Candidate> readCandidates(String path) throws IOException {
        List<Candidate> candidates = new ArrayList<>();
        Workbook workbook = WorkbookFactory.create(new File(path));
        Sheet firstSheet = workbook.getSheetAt(0);
        int rowsCount = firstSheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowsCount; i++) {
            Row row = firstSheet.getRow(i);
            if (i != 0) {
                String firstName = convertCellToString(row.getCell(0));
                String lastName = convertCellToString(row.getCell(1));
                String years = convertCellToString(row.getCell(2));
                String phone = convertCellToString(row.getCell(3));
                String job = convertCellToString(row.getCell(4));
                String jobCategory = convertCellToString(row.getCell(5));
                String experience = convertCellToString(row.getCell(6));
                candidates.add(new Candidate(firstName, lastName, years, phone, job, jobCategory, experience));
            }
        }
        return candidates;
    }

    @Override
    public List<Job> readJobs(String path) throws IOException {
        List<Job> jobs = new ArrayList<>();
        Workbook workbook = WorkbookFactory.create(new File(path));
        Sheet firstSheet = workbook.getSheetAt(0);
        int rowsCount = firstSheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowsCount; i++) {
            Row row = firstSheet.getRow(i);
            if (i != 0) {
                String companyName = convertCellToString(row.getCell(0));
                String job = convertCellToString(row.getCell(1));
                String jobCategory = convertCellToString(row.getCell(2));
                String experience = convertCellToString(row.getCell(3));
                jobs.add(new Job(companyName, job, jobCategory, experience));
            }
        }
        return jobs;
    }

    private String convertCellToString(Cell cell) {
        DataFormatter dataFormatter = new DataFormatter();
        return dataFormatter.formatCellValue(cell);
    }
}
