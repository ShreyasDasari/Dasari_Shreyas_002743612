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
public class HospitalHistory {
    
    private ArrayList<Hospital> HospitalHistory;

    public ArrayList<Hospital> getHospitalHistory() {
        return HospitalHistory;
    }

    public void setHospitalHistory(ArrayList<Hospital> HospitalHistory) {
        this.HospitalHistory = HospitalHistory;
    }
    
    public HospitalHistory(){
        this.HospitalHistory = new ArrayList<Hospital>();        
    }
      
    public void addNewHospital(){
        Hospital newHospital = new Hospital();
        HospitalHistory.add(newHospital);
    }
    
    public void deleteHospital(Hospital h){
        HospitalHistory.remove(h);
    }
}
