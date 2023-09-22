package com.campusdual.Ejercicio14_1;


public class Ejercicio14_1 {
    public static void main(String[] args) {

        Bombero bombero = new Bombero("Juan", "Sanchez", "Ourense");
        ConductorBus conductorBus = new ConductorBus("Maria", "Montessori", 35);
        Repartidor repartidor = new Repartidor("Jake", "Peralta", 99);

        bombero.getDetails();
        conductorBus.getDetails();
        repartidor.getDetails();

    }
}
