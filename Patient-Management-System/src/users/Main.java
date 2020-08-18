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
        Address address = new Address();
        
        address.setAddress(1, "Fake Street", "London", "CM1 3GU");
        
        System.out.println(address.getAddress());
    }
    
}
