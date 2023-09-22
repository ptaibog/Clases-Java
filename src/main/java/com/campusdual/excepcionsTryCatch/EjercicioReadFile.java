package com.campusdual.excepcionsTryCatch;

import java.io.*;

public class EjercicioReadFile {


    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(new File("file.txt")))) {

            String linea = "";
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
