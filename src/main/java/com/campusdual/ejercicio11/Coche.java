package com.campusdual.ejercicio11;

public class Coche {

    public String brand;
    public String  model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public int turnSteeringWheel;
    private boolean reverse;


    public Coche (String marca, String modelo){
        this.brand = marca;
        this.model = modelo;
    }

    public Coche (String marca, String modelo, String tipoCombustible){

        this.brand = marca;
        this.model = modelo;
        this.fuel = tipoCombustible;
    }


    public void start (){
        if (this.tachometer == 0) {

            this.tachometer = 1000;
            System.out.println("Coche encendido");
        }else {
            System.out.println("El coche ya está encendido");
        }
    }
    public void stop (){
        if (this.speedometer == 0 && this.tachometer == 0) {

            this.tachometer = 0;
            System.out.println("Coche apagado");
        }else {
            System.out.println("No podemos apagar el coche en esta situacion");
        }
    }

    public void accelerate (Integer cantidad){

        if(cantidad > 0 && cantidad <= 120){

        this.speedometer += cantidad;
            System.out.println("El coche va a: " + cantidad + " km/h");
        }else {
            System.out.println("Introduce un valor válido");
        }

        /*
        while (this.speedometer < Car.MAX_SPEED){
            this.speedometer += 10;
            sout
        }sout
         */
    }

    public void brake (){

        while (this.speedometer > 0){

            this.speedometer -= 10;
            System.out.println("Velocidad: " + this.speedometer);
        }
        System.out.println("Vehiculo detenido");
    }

    public void turnSteeringWheel (int girarVolante){

        this.turnSteeringWheel = girarVolante;
        if (this.turnSteeringWheel > 0){
            System.out.println("Gira a la derecha");
        }else if(this.turnSteeringWheel == 0){
            System.out.println("Vamos recto");
        }else {
            System.out.println("Gira a la izquierda");
        }
    }

    public void reverse (){
        if(this.speedometer == 0 ){
            if (this.reverse == true){
            System.out.println("Ponemos marcha adelante");
            this.reverse = false;
        }else{
            System.out.println("Ponemos marcha atras");
            this.reverse = true;
        }
        }else {
            System.out.println("No puedes poner la marcha atras en movimiento");
        }
    }

    public static void main(String[] args) {

        Coche coche1 = new Coche("Citroen", "Xsara", "Diesel");
        Coche coche2 = new Coche("Peugeot", "306");

        System.out.println(coche1.brand + " " + coche1.model);
        System.out.println(coche2.brand);
        System.out.println("Tacometro1: " + coche1.tachometer);
        System.out.println("Tacometro2: " + coche2.tachometer);
        coche1.start();
        coche1.start();
        System.out.println("Tacometro1: " + coche1.tachometer);
        System.out.println("Tacometro2: " + coche2.tachometer);
        coche1.accelerate(50);
        coche1.stop();
        coche1.brake();
        coche1.reverse();
    }
}
