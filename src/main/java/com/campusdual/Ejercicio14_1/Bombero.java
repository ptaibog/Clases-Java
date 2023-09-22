package com.campusdual.Ejercicio14_1;

public class Bombero extends Trabajador {

    String zonaAsignada;

    public Bombero(String name, String surname, String zonaAsignada) {
        super(name, surname);
        this.zonaAsignada = zonaAsignada;
    }

    @Override
    public void getDetails() {
        System.out.println("Bombero " + name + " " + surname + " designado a la zona: " + zonaAsignada);
    }
}
