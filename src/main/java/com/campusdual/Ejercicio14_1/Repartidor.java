package com.campusdual.Ejercicio14_1;

public class Repartidor extends Trabajador {

    int identificadorHojaRuta;


    public Repartidor(String name, String surname, int identificadorHojaRuta) {
        super(name, surname);
        this.identificadorHojaRuta = identificadorHojaRuta;
    }

    @Override
    public void getDetails() {
        System.out.println("Repartidor " + name + " " + surname + " con identificador de ruta: " + identificadorHojaRuta);
    }
}


