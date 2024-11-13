package com.emr;
import com.emr.Exceptions.RecordNotFoundException;
import com.emr.entities.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EMRSystem {
    // HashMap to store patients and their medical records
    private HashMap<String, patient> patients = new HashMap<>();
    private HashMap<String, List<MedicalRecord>> medicalRecords = new HashMap<>();

    // Method to add a new patient
    public void addPatient(patient patient) {
        patients.put(patient.getId(), patient);
        medicalRecords.put(patient.getId(), new ArrayList<>());
    }

    // Method to add a medical record for a specific patient
    public void addMedicalRecord(String patientId, MedicalRecord record) throws RecordNotFoundException {
        if (!patients.containsKey(patientId)) {
            throw new RecordNotFoundException("Patient with ID " + patientId + " not found.");
        }
        
        List<MedicalRecord> records = medicalRecords.get(patientId);
        records.add(record);
        System.out.println("Medical record added for patient ID: " + patientId);
    }

    // Method to view a patient's complete medical history
    public void viewMedicalHistory(String patientId) {
        if (!patient.containsKey(patientId)) {
            System.out.println("Patient with ID " + patientId + " not found.");
            return;
        }

        List<MedicalRecord> records = medicalRecords.get(patientId);
        if (records.isEmpty()) {
            System.out.println("No medical records found for patient ID: " + patientId);
        } else {
            System.out.println("Medical history for patient ID: " + patientId);
            for (MedicalRecord record : records) {
                System.out.println("Record ID: " + record.getRecordId() +
                        ", Description: " + record.getDescription() +
                        ", Date: " + record.getDate());
                
                if (record instanceof ChronicConditionRecord) {
                    System.out.println("Chronic Condition: " + ((ChronicConditionRecord) record).getCondition());
                }
            }
        }
    }

    // Method to update the diagnosis for a specific record
    public void updateDiagnosis(String recordId, String newDiagnosis) throws RecordNotFoundException {
        boolean recordFound = false;
        for (List<MedicalRecord> records : medicalRecords.values()) {
            for (MedicalRecord record : records) {
                if (record.getRecordId().equals(recordId)) {
                    record.setDescription(newDiagnosis);
                    recordFound = true;
                    System.out.println("Diagnosis updated for record ID: " + recordId);
                    break;
                }
            }
            if (recordFound) break;
        }
        
        if (!recordFound) {
            throw new RecordNotFoundException("Medical record with ID " + recordId + " not found.");
        }
    }

    // Method to generate a report for a specific patient
    public void generateReport(String patientId) {
        if (!patients.containsKey(patientId)) {
            System.out.println("Patient with ID " + patientId + " not found.");
            return;
        }

        Patient patient = patients.get(patientId);
        System.out.println("\nGenerating Report for Patient ID: " + patientId);
        System.out.println("Name: " + patient.getName() +
                ", Age: " + patient.getAge() +
                ", Gender: " + patient.getGender() +
                ", Contact Info: " + patient.getContactInfo());

        List<MedicalRecord> records = medicalRecords.get(patientId);
        if (records.isEmpty()) {
            System.out.println("No medical records found for this patient.");
        } else {
            System.out.println("Medical Records:");
            for (MedicalRecord record : records) {
                System.out.println("Record ID: " + record.getRecordId() +
                        ", Description: " + record.getDescription() +
                        ", Date: " + record.getDate());
                
                if (record instanceof ChronicConditionRecord) {
                    System.out.println("Chronic Condition: " + ((ChronicConditionRecord) record).getCondition());
                }
            }
        }
    }
}
