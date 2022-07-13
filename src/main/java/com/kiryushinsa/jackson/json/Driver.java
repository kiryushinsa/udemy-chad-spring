package com.kiryushinsa.jackson.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    
    public static void main(String[] args) {
        
        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();
            
            // read json
            Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
            
            //print first name
            System.out.println("FirstName: " + student.getFirstName());
            System.out.println("LastName: " + student.getLastName());
            
            Address tempAddress = student.getAddress();
    
            System.out.println("Street = " + tempAddress.getStreet());
            System.out.println("City = " + tempAddress.getCity());
            
            for( String tempLang : student.getLanguages() ) {
                System.out.println(tempLang);
            }
            
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        
    }
}
