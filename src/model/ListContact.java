
package model;

import java.util.ArrayList;
import view.Validation;

/**
 *
 * @author admin
 */
public class ListContact {

    ArrayList<Contact> list;
    Validation validation;

    public ListContact() {
        this.list = new ArrayList<>();
        this.validation = new Validation();
    }

    public ArrayList<Contact> addContact() {
        ArrayList<Contact> list_add = new ArrayList<>();
        System.out.println("------------Add Contact----------");
        System.out.println("Enter Name:");
        String addName = validation.checkInputString();
        System.out.println("Enter Group:");
        String addGroup = validation.checkInputString();
        System.out.println("Enter Address:");
        String addAddress = validation.checkInputString();
        validation.displayFomatPhone();
        System.out.println("Enter Phone:");
        boolean addPhone = validation.checkNumberPhone();
        Contact ct = new Contact(addName, addGroup, addAddress, addName);
        list.add(ct);
        list_add.add(ct);
        System.out.println("Do you want to continue (Y/N)? Choose Y to continue, N to return main screen");
        if (!validation.checkInputYesNo()) {
            return list_add;
        }
        return null;
    }
    
   public void displayContact(ArrayList<Contact> list_display) {
      // ArrayList<Contact> list_display = new ArrayList<>();
        System.out.println("ID    Name      Group     Address     Phone");
        for(Contact contact:list_display){
            System.out.println(contact.toString());
        }
    }
   
    public void deleteContect(ArrayList<Contact> list){
    }

}
