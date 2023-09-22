package com.campusdual;

public class Ejercicio5Bucles {

    // Comprobar si un numero es positivo o negativo (siempre consideramos el 0 como positivo)
    // Lo hemos resulto como procedimiento
    public static void comprobarPositivo(int number){

        if(number >= 0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }

    // Comprobar si un numero es múltiplo de otro
    // Lo hemos resuelto como funcion
    public static boolean comprobarMultiplo (int number1, int number2){

        if ((number1 % number2) == 0){  // ponemos el == para comparar, si es solo uno se establece el valor, aqui comparamos
            return true;
        } else {
            return false;
        }
    }

    // Comprobar que un número sea menor que otro

    public static void comprobarMayorMenor (int number1, int number2){

        if (number1 < number2){
            System.out.println("El numero " + number1 + " es menor que " + number2);
        } else if (number1 > number2) {
            System.out.println("El numero " + number1 + " es mayor que " + number2);
        } else {
            System.out.println("Son iguales");
        }
    }


    public static void main(String[] args) {

        comprobarPositivo(0);

        System.out.println("Multiplos: " + comprobarMultiplo(4, 2));

        comprobarMayorMenor(4, 7);

    }
}
