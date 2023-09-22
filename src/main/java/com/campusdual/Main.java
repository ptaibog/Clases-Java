package com.campusdual;


public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello world!");

        // VARIABLE
        /*
        int month = 12;
        System.out.println(month);
        month = 11;
        System.out.println(month);

        // CONSTANTE --> no se puede modificar (MAYUS)
        final int YEAR = 2023;
        System.out.println(YEAR);

        int value = 5;
        value = value + 3;
        value = 2 - value;
        value += 3; // suma 3
        value -= 1; //resta 1
        value *= 4;
        value = (value / 2 + 1 * 3);
        int value1 = 3;
        int value2 = 2;
        value = value1 + value2;
        final int CONST = 2;
        value = CONST;
        value += 3;
        System.out.println(value);

            // % -> es el modulo, por ej si dicido 4/2 seria el resto, en este caso el modulo es 0
         */

/*
        String cnv = "200";

        // convertimos String a Integer

        Integer cnv_int = Integer.parseInt(cnv);
        cnv_int += 3;

        char c = cnv.charAt(0); // muestra el caracter en la posicion 0 con char.At()

        System.out.println(cnv_int);
        System.out.println(c);

 */

        // LOGICA BOOLEANA

/*
        VERDADERO && VERDADERO = Verdadero;
        VERDADERO || FALSO = Verdadero;
        FALSO || FALSO = Falso;
        !FALSO || FALSO = Verdadero;

 */

        // Calcula el área de un circulo de radio 15 (A = pi * R al cuadrado)

        //final double pi = Math.PI;
        float radio = 15f;
        double area = Math.PI * Math.pow(radio, 2); // en vez de poner (radio * radio) podemos poner esta expresion
        System.out.println("El area de la circunferencia es de " + area);

        // Calcula la longitud  de la circunferencia de radio 15 (L = 2 * pi * R)

        double longitud = 2 * Math.PI * radio;
        System.out.println("La longitud de la circunferencia es de: " + longitud);


        System.out.println("El area utilizando la funcion es: " + area(18));

        int valuesum = add(3,2);
        System.out.println(valuesum);
    }

    // FUNCION AREA
    public static double area (double r){
        return  Math.PI * Math.pow(r, 2);
    }

    // PROCEDIMIENTO, no devuelve ningun valor, pone siempre void
    // por ejemplo main, imprime en pantalla


    // METODO, VA SIEMPRE ASOCIADO A UN OBJETO
    // es una funcion que trabaja con objetos

    public static int add (int value1, int value2){

        int result = value1 + value2;
        return result;

    }


}
