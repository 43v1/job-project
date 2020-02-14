package model;

import java.util.List;

public class Candidate {

    private String firstName;
    private String lastName;
    private String years;
    private String telephone;
    private String job;
    private String jobCategory;
    private String experience;
    private List<Job> suitableJobs;

    public Candidate() {
    }

    public Candidate(String firstName, String lastName, String years, String phone, String job, String jobCategory, String experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.years = years;
        this.telephone = phone;
        this.job = job;
        this.jobCategory = jobCategory;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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

    public List<Job> getSuitableJobs() {
        return suitableJobs;
    }

    public void setSuitableJobs(List<Job> suitableJobs) {
        this.suitableJobs = suitableJobs;
    }
}
