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
    
   public String[] getContactNames() {
        return contactNames;
    }

    /**
     * @param contactNames the contactNames to set
     */
    public void setContactNames(String[] contactNames) {
        this.contactNames = contactNames;
    }

    
    public Contact[] getContacts() {
        return contacts;
    }

    /**
     * @param contacts the contacts to set
     */
    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    /**
     * @return the contactCount
     */
    public int getContactCount() {
        return contactCount;
    }

    /**
     * @param contactCount the contactCount to set
     */
    public void setContactCount(int contactCount) {
        this.contactCount = contactCount;
    }
    private Contact[]contacts = new Contact[100];
    private int contactCount =0;
    private String[]contactNames =  new String[100];

    public void addContact (
            String firstName,
            String lastName,
            String phone,
            String email) {
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setEmail(email);
        getContacts()[getContactCount()]=contact;
        getContactNames()[getContactCount()]=contact.getFirstName();
        setContactCount(getContactCount() + 1);       
    }
    public void editContact (String firstName,
            String lastName,
            String phone,
            String email,
            int position) {
        Contact contact = contacts[position];
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhone(phone);
        contact.setEmail(email);
        getContacts()[position]=contact;
        getContactNames()[position]=contact.getFirstName();
            
    }
    public void delContact  (int position){
        contacts[position]=null;
        contactNames[position]="";
    }
    
    
            
}
