/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author shreyasdasariicloud.com
 */
public class DoctorHistory {
    
    private ArrayList<Doctor> doctorHistory;
    
    public DoctorHistory(){
        this.doctorHistory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorHistory() {
        return doctorHistory;
    }

    public void setDoctorHistory(ArrayList<Doctor> doctorHistory) {
        this.doctorHistory = doctorHistory;
    }
    
    public Doctor addNewDoctor(){
        Doctor newDoctor = new Doctor();
        doctorHistory.add(newDoctor);
        return newDoctor;
    
}
}
