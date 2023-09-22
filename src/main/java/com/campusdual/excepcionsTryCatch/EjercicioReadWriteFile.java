package com.campusdual.excepcionsTryCatch;

import java.io.*;

public class EjercicioReadWriteFile {

RandomNumber rn = new RandomNumber();
    public void lecturaFichero() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("salida.txt")))) { // new File significa: esta es la ruta de este fichero

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public void escrituraFichero() throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("salida.txt", true))) { // puedo poner solo new File() sin true, me crea un fichero nuevo
            for (int i = 0; i <= 10; i++) {
                pw.println(rn.randomNumber());
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        EjercicioReadWriteFile f = new EjercicioReadWriteFile();
        try {
            //File fe = new File("salida.txt"); //llamo al fichero f basicamente
            f.escrituraFichero();
            f.lecturaFichero();
            //new File("salida.txt").delete(); borra el fichero
            //fe.delete(); // otra forma de borrar el fichero, creando el objeto fe antes
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
