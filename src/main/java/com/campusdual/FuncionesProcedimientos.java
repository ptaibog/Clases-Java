package com.campusdual;

public class FuncionesProcedimientos {

    public static int funcionSuma (int value1, int value2){
        int resultado = value1 + value2;
        return resultado;
    }

    public static void procedimientoSuma (int value1, int value2){

       int resultado = value1 + value2;
        System.out.println(resultado);
    }



    public static void main(String[] args) {

        // invocamos funcionSuma, le damos valores y guardamos el resultado en la variable valeSum, para luego impriomir en pantalla
        // podemos asignar el valor porque estamos haciendo una funcion, no tiene un void

        int valeSum = funcionSuma(3, 2);
        System.out.println(valeSum);

        // En este caso lo que tenemos es un procedimiento con void, por lo que el resultado no podemos asignarlo a otra variable,
        // tenemos que dejar indicado dentro del procedimiento suma() lo que queremos hacer con el resultado que de dentro del procedimiento, no en el main

        procedimientoSuma(5, 8);
    }
}
