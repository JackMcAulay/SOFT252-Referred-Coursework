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
public class User {
    
    protected String id;
    protected String firstName;
    protected String surname;
    protected Address address;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
    
    public String getAddress() {
        return address.getAddress();
    }
    
    public String getAllDetails(){
        return(firstName + " " + surname + "" + "\n" + getAddress());
    }
}
