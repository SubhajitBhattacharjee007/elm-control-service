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

    public Ticket() {
    }

    public Ticket(String projectName, String issueType) {
        this.projectName = projectName;
        this.issueType = issueType;
    }

    public Ticket(Long id, String projectName, String issueType) {
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
