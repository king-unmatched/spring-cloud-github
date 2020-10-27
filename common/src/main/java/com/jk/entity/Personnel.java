package com.jk.entity;

public class Personnel {
    private Integer personnelId;

    private String personnelName;

    private String jobApplication;

    private String telephone;

    private String infoSources;

    private Integer feedback;

    private Integer status;

    public Integer getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Integer personnelId) {
        this.personnelId = personnelId;
    }

    public String getPersonnelName() {
        return personnelName;
    }

    public void setPersonnelName(String personnelName) {
        this.personnelName = personnelName == null ? null : personnelName.trim();
    }

    public String getJobApplication() {
        return jobApplication;
    }

    public void setJobApplication(String jobApplication) {
        this.jobApplication = jobApplication == null ? null : jobApplication.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getInfoSources() {
        return infoSources;
    }

    public void setInfoSources(String infoSources) {
        this.infoSources = infoSources == null ? null : infoSources.trim();
    }

    public Integer getFeedback() {
        return feedback;
    }

    public void setFeedback(Integer feedback) {
        this.feedback = feedback;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}