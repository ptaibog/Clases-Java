package com.campusdual.EjListinTelefonico;

import java.util.HashMap;
import java.util.Map;

public class Agenda {


    private Map<String, Person> contactMap = new HashMap<>();

    public Agenda() {
    }



    public void addContact(Person c){
        this.getContactMap().put(c.getDni(), c); // dni es la key, c es el resto de la informacion de esa persona
    }
    public void removeContact(String key){
        this.getContactMap().remove(key); // key es el dni, al quitarlo se lo especificamos y ese dessaparece
    }


    public Map<String, Person> getContactMap() {
        return contactMap;
    }

    public void setContactMap(Map<String, Person> contactMap) {
        this.contactMap = contactMap;
    }
}
