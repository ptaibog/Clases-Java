package com.campusdual.excepcionsTryCatch;

public class Ejercicio28 {


    public static void main(String[] args) {

        int dividendo = 3, divisor = 0;
        try{
            int res = dividendo/divisor;
            System.out.println(res);
        }catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Este programa realiza una operacion aritmetica prohibida");
        }catch (Exception e){
            e.printStackTrace(); //se pueden usar varios catch
        }finally {
            System.out.println("Programa finalizao correctamente");
        }
    }

}
