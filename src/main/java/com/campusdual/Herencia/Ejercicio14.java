package com.campusdual.Herencia;

public class Ejercicio14 {

    public static void main(String[] args) {
        Person p = new Person("John", "Smith");
        Teacher t = new Teacher("Maria", "Montessori", "Educación");
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d = new Doctor("Gregory", "House", "Nefrología e Infectología");

        p.getDetails(); //person
        t.getDetails(); //teacher
        po.getDetails(); // policeOfficer
        d.getDetails(); // ejecuta el metodo getDetails, pero va a Doctor a buscar el @override
    }
}
