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
public class Address {
    private int houseNumber;
    private String street;
    private String townCity;
    private String postCode;
    
    public void setAddress(int setHouseNumber, String setStreet, String setTownCity, String setPostCode){
        houseNumber = setHouseNumber;
        street = setStreet;
        townCity = setTownCity;
        postCode = setPostCode;
    }
    
    public String getAddress(){
        String userAddress;
        
        userAddress = (houseNumber + " " + street + "" + "\n" + townCity + "\n" + postCode);
        
        return userAddress;
    }
}
