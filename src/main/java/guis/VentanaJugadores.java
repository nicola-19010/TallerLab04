package guis;

import dato.DatosSelecciones;
import modelo.Seleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaJugadores extends Ventana implements ActionListener {
    private Seleccion seleccion;
    private JButton editarJugadorBtn;
    private JButton guardarCambiosBtn;
    private JButton volverBtn;

    public VentanaJugadores(Seleccion seleccion){
        this.seleccion = seleccion;

        this.setTitle("Jugadores");
        this.generarEtiqueta("Informacion oficial: ", 20, 10, 150, 20);

        generarComboBoxJugadores( seleccion.getJugadores()
                ,30,35,300,30);


        editarJugadorBtn = generarBoton("Editar ",  20, 200, 80, 60);
        guardarCambiosBtn = generarBoton("Guardar",120,200,100,60);
        volverBtn = generarBoton("Volver", 240 , 200, 80, 60);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == volverBtn) {
            var selecciones = new ArrayList<Seleccion>();
            //new VentanaEquipos(DatosSelecciones.leerArchivoSelecciones(selecciones, "teams.txt"));
            this.dispose();
        }

    }
}
