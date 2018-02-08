/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author glimp
 */
public class ContactApp {
    
    Contact[] contacts; 
    int contactCount = 0;

    public ContactApp() {
        this.contacts = new Contact[100];
    }
    void addContact(String firstName, String lastName, String phoneNumber, String email){
        Contact contact = new Contact();
        contact.setFirstname(firstName);
        contact.setLastname(lastName);
        contact.setPhonenumber(phoneNumber);
        contact.setEmail(email);
        
       
        contacts[contactCount++] = contact;
    }
    
    
            
}
