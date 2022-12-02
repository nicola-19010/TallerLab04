package dato;

import modelo.Jugador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DatosJugadores {
    public  static void leerArchivoJugadores(ArrayList<Jugador> jugadores, String direccionArchivo){
        String textoArchivo;


        try {
            File archivo = new File("./src/main/resources/"+direccionArchivo);
            //src/main/resources/aus.txt
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while ((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(";");
                jugadores.add(new Jugador(data[0],data[1],data[2]));
            }

        } catch (Exception e) {
            System.out.println("Documento no disponible: Datos Jugadores");
        }
    }


}
