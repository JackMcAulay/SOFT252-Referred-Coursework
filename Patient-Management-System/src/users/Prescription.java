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
public class Prescription {
    protected Patient patient;
    protected String medication;
    protected int dose;
    protected int quantity;
    
    public void createPrescription(Patient presPatient, String presMedication, int presDose, int presQuantity){
        patient = presPatient;
        medication = presMedication;
        dose = presDose;
        quantity = presQuantity;
    }
    
    public String viewPrescription(){
        String prescription;
        
        prescription = ("\nMedication: " + medication + "\nQuantity: " + "\nDose: " + dose + " per Day");
        
        return prescription;
    }
}
