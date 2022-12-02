package launcher;

import dato.DatosSelecciones;
import guis.VentanaEquipos;
import guis.VentanaJugadores;
import modelo.Seleccion;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        ArrayList<Seleccion> selecciones = new ArrayList<>();
        DatosSelecciones.leerArchivoSelecciones(selecciones, "teams.txt");
        new VentanaEquipos(selecciones);

    }
}
