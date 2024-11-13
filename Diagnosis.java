package com.emr.entities;


import java.util.Date;

public class Diagnosis {
    private String diagnosisId;
    private String recordId;
    private Date diagnosisDate;
    private String description;

    public Diagnosis(String diagnosisId, String recordId, Date diagnosisDate, String description) {
        this.diagnosisId = diagnosisId;
        this.recordId = recordId;
        this.diagnosisDate = diagnosisDate;
        this.description = description;
    }

   
    public String getDiagnosisId() { return diagnosisId; }
    public void setDiagnosisId(String diagnosisId) { this.diagnosisId = diagnosisId; }

    public String getRecordId() { return recordId; }
    public void setRecordId(String recordId) { this.recordId = recordId; }

    public Date getDiagnosisDate() { return diagnosisDate; }
    public void setDiagnosisDate(Date diagnosisDate) { this.diagnosisDate = diagnosisDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
