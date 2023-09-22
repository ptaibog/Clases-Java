package com.campusdual.Herencia;

public class PoliceOfficer extends Person{


    protected String squad;

    public PoliceOfficer(String name, String surname, String squad) {
        super(name, surname);
        this.squad = squad;
    }
}
