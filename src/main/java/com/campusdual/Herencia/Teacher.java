package com.campusdual.Herencia;

public class Teacher extends Person{


    protected String area;

    public Teacher(String name, String surname, String area) {
        super(name, surname);
        this.area = area;
    }
}
