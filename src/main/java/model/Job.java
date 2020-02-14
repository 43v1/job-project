package model;

public class Job {

    private String companyName;
    private String job;
    private String jobCategory;
    private String experience;

    public Job() {
    }

    public Job(String companyName, String job, String jobCategory, String experience) {
        this.companyName = companyName;
        this.job = job;
        this.jobCategory = jobCategory;
        this.experience = experience;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
