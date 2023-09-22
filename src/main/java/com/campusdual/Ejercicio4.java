package com.campusdual;

import javax.swing.plaf.PanelUI;
import java.sql.SQLOutput;

public class Ejercicio4 {

    // Sumar los 5 primeros numeros naturales

    public static int sumaNatural(){

        int resultado = 1 + 2 + 3 + 4 + 5;
        return resultado;
    }

    // Sumar los 20 primeros numeros pares

    public static void sumaPares (){

        int resultado = 2+4+6+8+10+12+14+16+18+20+22+24+26+28+30+32+34+36+38+40;
        System.out.println("El resultado de los 20 primeros numeros pares es: " + resultado);
    }

    // Calcular el factorial de un numero ( 5!: 5*4*3*2*1)
    // Para este ej vamos a usar un bucle
    /*
    public static int claculaFactorial(){

        int factorial = 5*4*3*2*1;
        System.out.println(factorial);
    }

     */



    public static void main(String[] args) {

        int resultado5 = sumaNatural();
        System.out.println("El resultado de los 5 primeros numeros es: " + resultado5);

        sumaPares();

    }
}
