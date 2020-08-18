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
public class Doctor extends User{ 
    public void setDoctorDetails(String id, String fName, String sName, Address address){
        this.id = id;
        this.firstName = fName;
        this.surname = sName;
        this.address = address;
    }
}
