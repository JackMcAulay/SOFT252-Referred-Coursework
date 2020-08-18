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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patient John = new Patient();
        Doctor DrBob = new Doctor();
        Address address1 = new Address();
        Address address2 = new Address();
        Appointment appointment = new Appointment();
        Prescription prescription = new Prescription();
        
        address1.setAddress(55, "Portland Square Building, Drake Circus", "Plymouth", "PL4 8AA");
        John.setPatientDetails("P1234", "John", "Doe", address1, 45, "Male");
        
        address2.setAddress(24, "Fictitious Clinic, Diagon Alley", "Plymouth", "PL4 8AA");
        DrBob.setDoctorDetails("D3245", "Bob", "Doe", address2);
       
        appointment.createAppointment(John, DrBob, 1);
        
        appointment.addNotes("Mr. John Doe has been suffering from fever for the last two weeks. He is coughing and the phlegm is green in colour. ");
        
        prescription.createPrescription(John, "Amoxicillin ", 24, 4);
        appointment.addPrescription(prescription);
        
        appointment.appointmentSummary();
    }
    
}
