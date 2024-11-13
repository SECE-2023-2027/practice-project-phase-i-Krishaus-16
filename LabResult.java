
package com.emr.entities;

import java.util.Date;

public class LabResult {
    private String labResultId;
    private String recordId;
    private Date testDate;
    private String testType;
    private String resultValue;

    public LabResult(String labResultId, String recordId, Date testDate, String testType, String resultValue) {
        this.labResultId = labResultId;
        this.recordId = recordId;
        this.testDate = testDate;
        this.testType = testType;
        this.resultValue = resultValue;
    }

   
    public String getLabResultId() { return labResultId; }
    public void setLabResultId(String labResultId) { this.labResultId = labResultId; }

    public String getRecordId() { return recordId; }
    public void setRecordId(String recordId) { this.recordId = recordId; }

    public Date getTestDate() { return testDate; }
    public void setTestDate(Date testDate) { this.testDate = testDate; }

    public String getTestType() { return testType; }
    public void setTestType(String testType) { this.testType = testType; }

    public String getResultValue() { return resultValue; }
    public void setResultValue(String resultValue) { this.resultValue = resultValue; }
}
