package com.campusdual.Ejercicio14_1;

public class ConductorBus extends Trabajador {

    int lineaAsignada;

    public ConductorBus(String name, String surname, int lineaAsignada) {
        super(name, surname);
        this.lineaAsignada = lineaAsignada;
    }

    @Override
    public void getDetails() {
        System.out.println("Conductor " + name + " " + surname + " designado a la linea: " + lineaAsignada);
    }
}
