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
public class PatientHistory {
    
    private ArrayList<Patient> Patienthis;
    
    public PatientHistory(){
        this.Patienthis = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatienthis() {
        return Patienthis;
    }

    public void setPatienthis(ArrayList<Patient> Patienthis) {
        this.Patienthis = Patienthis;
    }
    public Patient addNewPatient(){
        Patient newPatient = new Patient();
        Patienthis.add(newPatient);
        return newPatient;
           
    }
    
    public void deletePatient(Patient p){
        Patienthis.remove(p);
    } 
    
    public void updateProduct(Patient p){
        Patienthis.add(p);
    }
        
    
}
