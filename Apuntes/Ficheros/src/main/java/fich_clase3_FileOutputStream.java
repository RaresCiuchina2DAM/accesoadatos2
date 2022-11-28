package Apuntes.Ficheros.src.main.java;

import java.io.*;

public class fich_clase3_FileOutputStream {
    public static void main(String[] args) throws IOException {
        // Creamos un flujo de salida de datos
        // TODO: FICHEROS BINARIOS

        File f = new File("C:\\Users\\Rares\\Desktop\\fichero1.bin");
        FileOutputStream fO = new FileOutputStream(f, false);

        fO.write('c');
        fO.write('x');
        fO.write(1);
        fO.write(2);

        fO.close();

        //
        FileInputStream fI = new FileInputStream(f);
        int car = 0;
        car = fI.read();
        while (car != -1) {
            System.out.print((char) car);
            car = fI.read();
        }
    }
}

