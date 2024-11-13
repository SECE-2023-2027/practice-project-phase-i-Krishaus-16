package com.emr.entities;

import java.util.Date;

public abstract class MedicalRecord {
    protected String recordId;
    protected String patientId;
    protected String description;
    protected Date date;

    public MedicalRecord(String recordId, String patientId, String description, Date date) {
        this.recordId = recordId;
        this.patientId = patientId;
        this.description = description;
        this.date = date;
    }

    
    public String getRecordId() { return recordId; }
    public void setRecordId(String recordId) { this.recordId = recordId; }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
}

