/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author shreyasdasariicloud.com
 */
public class Patient extends Person {
    public String name;
    public int age;
    public String gender;
    public String address;
    public String city;
    public int pincode;
    public int cellphoneno;
    public String emailID;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public int getPincode() {
        return pincode;
    }

    @Override
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public int getCellphoneno() {
        return cellphoneno;
    }

    @Override
    public void setCellphoneno(int cellphoneno) {
        this.cellphoneno = cellphoneno;
    }

    @Override
    public String getEmailID() {
        return emailID;
    }

    @Override
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    
    
}
