package com.campusdual;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Calendar;

public class Ejercicio6 {

    // Comprobar cual es la estacion del año



    //public static void comprobarEstacion(String mes){






    // Comprobar si de mañana, tarde o noche

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
        int mes = cal.get(Calendar.MONTH) + 1;
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        switch (mes + 1){
            case 1:
            case 2:
            case 3:
                System.out.println("Estamos en invierno");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Estamos en primavera");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Estamos en verano, mes: " + mes);
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("Este mes no existe");
            }
        }
    }

