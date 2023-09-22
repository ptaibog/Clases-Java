package com.campusdual.ejercicio13;

public class Ejercicio13_1 {

    // los atributos deberian ir siempre como minimo protected
    protected int actualFuel = 10;

    public void showDetails() {
        System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
    }

    public void setActualFuel(int actualFuel){
        if (actualFuel >= 0){
            this.actualFuel = actualFuel;
        }else {
            System.out.println("La capacidad no puede ser negativa");
        }
    }

    public static void main(String[] args) {
        Ejercicio13_1 cO = new Ejercicio13_1();
        cO.showDetails();
        System.out.println("Actualización capacidad");
        cO.setActualFuel(-8);
        System.out.println(cO.actualFuel);
        cO.showDetails();
    }
}
