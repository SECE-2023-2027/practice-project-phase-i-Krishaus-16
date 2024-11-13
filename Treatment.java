package com.emr.entities;


import java.util.Date;

public class Treatment {
    private String treatmentId;
    private String recordId;
    private Date treatmentDate;
    private String description;

    public Treatment(String treatmentId, String recordId, Date treatmentDate, String description) {
        this.treatmentId = treatmentId;
        this.recordId = recordId;
        this.treatmentDate = treatmentDate;
        this.description = description;
    }

  
    public String getTreatmentId() { return treatmentId; }
    public void setTreatmentId(String treatmentId) { this.treatmentId = treatmentId; }

    public String getRecordId() { return recordId; }
    public void setRecordId(String recordId) { this.recordId = recordId; }

    public Date getTreatmentDate() { return treatmentDate; }
    public void setTreatmentDate(Date treatmentDate) { this.treatmentDate = treatmentDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
