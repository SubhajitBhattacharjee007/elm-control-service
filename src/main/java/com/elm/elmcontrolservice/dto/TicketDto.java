package com.elm.elmcontrolservice.dto;

public class TicketDto {

    private Long id;
    private String projectName;
    private String issueType;

    public TicketDto() {
    }

    public TicketDto(Long id, String projectName, String issueType) {
        this.id = id;
        this.projectName = projectName;
        this.issueType = issueType;
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

}
