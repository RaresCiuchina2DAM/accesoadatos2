//Fichero de objetod binarios
//JAVA serializa, convierte la serialización
//En algo legible
//import Serializable; (parece que no va)
//writeObject(objeto)
//readObject() --> escribe un objeto

import java.io.*;

public class fich_clase5_objUs {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //TODO ARCHIVOS BINARIOS

        File f = new File("C:\\Users\\AlumnoM\\Desktop\\doc_objUs.bin");
        //Con false borra tod.o y vuelve a escribir
        //Con True respeta lo que hay y vuelve a escribir,
        //pero al leer lee tod.o y se sale cuando detecta la cabecera
        ObjectOutputStream fO = new ObjectOutputStream(new FileOutputStream(f, true));

        fO.writeObject("Primero");
        fO.writeObject("Segundo");
        fO.close();

        ObjectInputStream fI = null;
        try {
            fI = new ObjectInputStream(new FileInputStream(f));
            do {
                System.out.println(fI.readObject());
            } while (true);
        } catch (Exception e) {
            System.out.println("Fin de lectura");
        } finally {
            fI.close();
        }

        fI.close();
    }
}
