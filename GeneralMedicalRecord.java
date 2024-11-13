package com.emr.entities;

import java.util.Date;

public class GeneralMedicalRecord extends MedicalRecord {
    public GeneralMedicalRecord(String recordId, String patientId, String description, Date date) {
        super(recordId, patientId, description, date);
    }

    
}

