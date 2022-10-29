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
    
    private ArrayList<Person> history;
    
    public Personhistory(){
        this.history = new ArrayList<Person>();
        
    }

    public ArrayList<Person> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Person> history) {
        this.history = history;
    }
    
    public Person addNewPerson(){
        Person newPerson = new Person();
        history.add(newPerson);
        return newPerson;           
    }         
    
    public void deletePerson(Person newPerson){
        history.remove(newPerson);        
    }
    
    public void updatePerson(Person newPerson){
        history.add(newPerson);       
    }
            
    
    
}
