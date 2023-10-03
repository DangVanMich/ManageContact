/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;
import model.Contact;

public class Validation {

    private final static Scanner sc = new Scanner(System.in);

    //  private final String phoneRegex = "^\\(?(\\d{3})\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}(?:\\s*(?:ext|x)\\s*(\\d+))?$";
    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int check = Integer.parseInt(sc.nextLine().trim());
                if (check < min || check > max) {
                    throw new Exception();
                } else {
                    return check;
                }
            } catch (Exception e) {
                System.out.println("Please input number in range [" + min + ", " + max + "]!");
                System.out.println("Enter again: ");
            }
        }
    }

    public String checkInputString() {
        while (true) {
            String string = sc.nextLine().trim();
            if (string.isEmpty()) {
                System.out.println("Not allowed empty!");
                System.out.println("Enter again: ");
            } else {
                return string;
            }
        }
    }
    
    public boolean checkInputYesNo() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please input y/Y or n/N.");
            System.out.println("Enter again: ");
        }
    }

    public boolean checkIdExist(ArrayList<Contact> list, int id) {
        for (Contact eac : list) {
            if (eac.getId() != id) {
                System.out.println("No found contact");
                return true;
            }
        }
        return false;
    }

    public void displayFomatPhone() {
        System.out.println("Please input Phone flow");
        System.out.println("• 1234567890");
        System.out.println("• 123-456-7890");
        System.out.println("• 123-456-7890 x1234");
        System.out.println("• 123-456-7890 ext1234");
        System.out.println("• (123)-456-7890");
        System.out.println("• 123.456.7890");
        System.out.println("• 123 456 7890");
    }

    public  boolean checkNumberPhone() {
        while(true){
        String phoneRegex = "^\\(?(\\d{3})\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}(?:\\s*(?:ext|x)\\s*(\\d+))?$";
        String phoneNumber = sc.nextLine();
        if (Pattern.matches(phoneRegex, phoneNumber)) {
            System.out.println("Successful");
            return true;
        } else {
            System.out.println("Invalid format. Please enter a valid phone number.");
            return false;
        }
        }
    }

}
