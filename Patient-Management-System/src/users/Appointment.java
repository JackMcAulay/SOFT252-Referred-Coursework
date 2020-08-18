/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author jack
 */
public class Appointment {
    protected Patient patient;
    protected Doctor doctor;
    protected int room;
    
    protected boolean notesMade = false;
    protected String notes;
    
    protected boolean wasPrescriptionMade = false;
    protected Prescription prescription;
    
    public void createAppointment(Patient aptPatient, Doctor aptDoctor, int aptRoom){
        patient = aptPatient;
        doctor = aptDoctor;
        room = aptRoom;
    }
    
    public void addNotes(String aptNotes){
        notesMade = true;
        notes = aptNotes;
    }
    
    public void addPrescription(Prescription aptPrescription){
        wasPrescriptionMade = true;
        prescription = aptPrescription;
    }
    
    public void appointmentSummary(){
        System.out.println("Doctor\n" + doctor.getAllDetails() + "\n\nPatient\n" + patient.getAllDetails());
        
        if(notesMade){
            System.out.println("\nNotes: " + notes);
        }
        
        if(wasPrescriptionMade){
            System.out.println(prescription.viewPrescription());
        }
    }
}
