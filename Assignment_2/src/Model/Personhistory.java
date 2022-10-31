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
public class Personhistory {
    
    private ArrayList<Person> personHistory;
    
    public Personhistory(){
        this.personHistory = new ArrayList<Person>();
        
    }

    public ArrayList<Person> getHistory() {
        return personHistory;
    }

    public void setHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        personHistory.add(newPerson);
        return newPerson;           
    }         
    
    public void deletePerson(Person newPerson){
        personHistory.remove(newPerson);        
    }
    
    public void updatePerson(Person newPerson){
        personHistory.add(newPerson);       
    }
            
    
    
}
