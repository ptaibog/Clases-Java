package com.campusdual;

public class EstructurasControlBucles {

    // IF/ELSE
    /*
    int value = 4;
        if(value >=5)
    {
        System.out.println("El valor el mayor o igual 5");
    } else
    {
        System.out.println("El valor es menor que 5");
    }

     */




    public static void main(String[] args) {

        // SWITCH

        int value = 1;
        switch (value + 1) {
            case 1:
                value = value +1;
                break;
            case 2:
                value = value + 0;
                break;
            case 3:
                value = value -1;
                break;
            default:
                value = value * 2;
                break;
        }
        System.out.println(value);
    }

}
