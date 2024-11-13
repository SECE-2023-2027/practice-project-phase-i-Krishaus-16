package com.emr.Exceptions;


//Custom exception for cases when a record is not found in the EMR system
@SuppressWarnings("serial")
public class RecordNotFoundException extends Exception {
 public RecordNotFoundException(String message) {
     super(message);  // Passes the message to the superclass Exception
 }
}
