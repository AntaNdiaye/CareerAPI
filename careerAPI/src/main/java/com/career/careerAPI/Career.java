package com.career.careerAPI;

public class Career {
    private String jobTitle;
    private String jobDescription;

    public Career(String jobTitle, String jobDescription, double salary) {
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.salary = salary;
    }

    private double salary;


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
