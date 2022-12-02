package dato;

import modelo.Jugador;
import modelo.Seleccion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class DatosSelecciones {
    public  static void leerArchivoSelecciones(ArrayList<Seleccion> selecciones, String direccionArchivo){
        String textoArchivo;


        try {
            File archivo = new File("./src/main/resources/"+direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);



            while ((textoArchivo = br.readLine()) != null){
                ArrayList<Jugador> jugadores = new ArrayList<>();
                String[] data = textoArchivo.split(";");
                DatosJugadores.leerArchivoJugadores(jugadores, data[3].replaceAll("png","txt"));

                selecciones.add(new Seleccion(data[0], data[1],data[2],data[3], jugadores));
            }

        } catch (Exception e) {
            System.out.println("Documento no disponible: Datos Selecciones");
        }
    }


}
