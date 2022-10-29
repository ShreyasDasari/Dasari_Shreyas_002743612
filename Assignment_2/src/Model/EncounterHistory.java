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
public class EncounterHistory {
    private ArrayList<Encounter> EncounterHistory;

    public ArrayList<Encounter> getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> EncounterHistory) {
        this.EncounterHistory = EncounterHistory;
    }
    
    public EncounterHistory(){
        this.EncounterHistory = new ArrayList<Encounter>();
    }
    
    public void AddEncounter(){
        Encounter newEncounter = new Encounter();
        EncounterHistory.add(newEncounter);
    }
    
    public void DeleteEncounter(Encounter en){
        EncounterHistory.remove(en);
    }
}
