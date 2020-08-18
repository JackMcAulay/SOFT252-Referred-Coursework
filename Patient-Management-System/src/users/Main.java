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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patient John = new Patient();
        Doctor DrBob = new Doctor();
        Address address1 = new Address();
        Address address2 = new Address();
        
        address1.setAddress(1, "Fake Street", "London", "EL1 3ZU");
        John.setPatientDetails("P1234", "John", "Smith", address1, 20, "Male");
        
        address2.setAddress(3, "Real Street", "London", "WL1 13P");
        DrBob.setDoctorDetails("D3245", "Bob", "Doe", address2);
       
        System.out.println(John.getAllDetails());
        System.out.println(DrBob.getAllDetails());
    }
    
}
