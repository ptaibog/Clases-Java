package com.campusdual;

public class Ejercicio7 {

    // Suma los primeros 100 numeros naturales
    public static int sumaCien() {
        int suma = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            suma += i; // suma = suma + i;
        }
        return suma;
    }

    // Muestra los primeros 15 numeros naturales
    public static void  cuenta15(int max){ // se puede obviar el int max y poner 15 en el bucle

        int i;

        for (i = 0; i < max; i++){
            System.out.println(i + 1);
        }
    }

    public static void main(String[] args) {


        cuenta15(15);

        System.out.println("La suma de los 100 primeros numeros es: " + sumaCien());



    }
}
