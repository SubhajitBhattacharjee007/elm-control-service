package com.elm.elmcontrolservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "projectName")
    private String projectName;

    @Column(name = "issueType")
    private String issueType;

    @Column(name = "status")
    private String status;

    @Column(name = "acceptanceCriteria")
    private String acceptanceCriteria;

    @Column(name = "priority")
    private String priority;

    @Column(name = "description")
    private String description;

    @Column(name = "summary")
    private String summary;

    public Ticket() {
    }

    public Ticket(Long id, String projectName, String issueType, String status, String acceptanceCriteria,
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

    public Ticket(String projectName, String issueType, String status, String acceptanceCriteria,
            String priority, String description, String summary) {
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
