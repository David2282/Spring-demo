package my.resume.Spring.service;

import my.resume.Spring.model.AddressLocation;

public class AddressUtility {
// Method to format address as a single string
public static String formatAddress(AddressLocation address){
    return String.format("""
                    %d %s 
                    %s, %s 
                    %d 
                    """, address.getStreetNumber(), address.getStreetName(), address.getCity(), address.getState(), address.getZipCode());
} 

}
