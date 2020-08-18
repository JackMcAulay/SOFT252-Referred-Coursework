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
public class Patient extends User {
    
    protected int age;
    protected String gender;
    
    public void setPatientDetails(String id, String fName, String sName, Address address, int patientAge, String patientGender){
        this.id = id;
        this.firstName = fName;
        this.surname = sName;
        this.address = address;
        age = patientAge;
        gender = patientGender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
  
}
