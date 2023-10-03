/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Contact;
import model.ListContact;
import view.Menu;

/**
 *
 * @author admin
 */
public class ManagerContact extends Menu<String> {
    
    private ListContact list;
    private ArrayList<Contact> list_ct;

    static String[] mc = {"Add a contact", "Display all contact", "Delete a contact", "Exit"};

    public ManagerContact() {
        super("================Contact Program=============", mc);
        list = new ListContact();
        list_ct = new ArrayList<>();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                list_ct = list.addContact();
                break;
            case 2:
                list.displayContact(list_ct);
                break;
            case 3:

                break;
            case 4:
                System.exit(0);
                break;

        }
    }

}
