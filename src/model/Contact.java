/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Contact {
    protected int Id;
    protected String Name;
//    protected String Fname;
//    protected String Lname;
    protected String Group;
    protected String Address;
    protected String Phone;

    public Contact() {
    }

    public Contact( String Name, String Group, String Address, String Phone) {
        this.Id = 1;
        this.Name = Name;
//        this.Fname = Fname;
//        this.Lname = Lname;
        this.Group = Group;
        this.Address = Address;
        this.Phone = Phone;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

//    public String getFname() {
//        return Fname;
//    }
//
//    public void setFname(String Fname) {
//        this.Fname = Fname;
//    }
//
//    public String getLname() {
//        return Lname;
//    }
//
//    public void setLname(String Lname) {
//        this.Lname = Lname;
//    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return Id + "  " + Name + "    " + Group + "    " + Address + "    " + Phone;
    }

    
    
        
}
