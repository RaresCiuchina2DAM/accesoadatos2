import java.io.*;

public class main2 {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\Rares\\Desktop\\fichero1.txt");

        CambiarpalabrasEscribiendoFicheroNuevo(f,"hola","adios");
    }

    //metodo para cambiar todas las palanras "hola" del fichero f y escriba un "adios" en su lugar
    public static void CambiarpalabrasEscribiendoFicheroNuevo(File f, String palabra1, String palabra2) throws IOException {
        BufferedReader bR = new BufferedReader(new FileReader(f));
        File f2 = new File("C:\\Users\\Rares\\Desktop\\fichero2.txt");
        BufferedWriter bW = new BufferedWriter(new FileWriter(f2));
        String linea = "";

        linea = bR.readLine();
        while (linea != null) {
            if (linea.contains(palabra1)) {
                bW.write(linea.replace(palabra1, palabra2));
                bW.newLine();
            } else {
                bW.write(linea);
                bW.newLine();
            }

            bW.close();
            bR.close();

        }
    }



    //cambiar todas las palabras "hola" del fichero f y escriba un "adios" en su lugar
    public static void CambiarPalabrasMismoFichero2(File f, String palabra1, String palabra2) throws IOException {
        BufferedReader bR = new BufferedReader(new FileReader(f));
        File f2 = new File("C:\\Users\\Rares\\Desktop\\fichero2.txt");
        BufferedWriter bW = new BufferedWriter(new FileWriter(f2));
        String linea = "";

        linea = bR.readLine();
        while (linea != null) {
            if (linea.contains(palabra1)){
                bW.write(linea.replace(palabra1,palabra2));
                bW.newLine();
            }
            linea = bR.readLine();
        }

        bW.close();
        bR.close();



    }
}