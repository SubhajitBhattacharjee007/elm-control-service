package com.elm.elmcontrolservice.dto;

public class TicketDto {

    private Long id;
    private String projectName;
    private String issueType;
    private String status;
    private String acceptanceCriteria;
    private String priority;
    private String description;
    private String summary;

    public TicketDto() {
    }

    public TicketDto(Long id, String projectName, String issueType, String status, String acceptanceCriteria,
            String priority, String description, String summary) {
        this.id = id;
        this.projectName = projectName;
        this.issueType = issueType;
        this.status = status;
        this.acceptanceCriteria = acceptanceCriteria;
        this.priority = priority;
        this.description = description;
        this.summary = summary;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getIssueType() {
        return this.issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

}
