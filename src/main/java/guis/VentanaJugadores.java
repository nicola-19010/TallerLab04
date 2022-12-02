package guis;

import modelo.Seleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJugadores extends Ventana implements ActionListener {
    private Seleccion seleccion;
    private JButton editarJugadorBtn;
    private JButton guardarCambiosBtn;
    private JButton volverBtn;

    public VentanaJugadores(Seleccion seleccion){
        this.seleccion = seleccion;

        this.setTitle("Jugadores");
        this.generarEtiqueta("Informacion oficial: ", 20, 10, 150, 20);

        generarComboBoxJugadores( seleccion.getJugadores(),30,20,300,30);


        editarJugadorBtn = generarBoton("Editar ",  20, 200, 80, 60);
        guardarCambiosBtn = generarBoton("Guardar",120,200,100,60);
        volverBtn = generarBoton("Salir", 240 , 200, 80, 60);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == volverBtn) {
            //new VentanaEquipos();
            this.dispose();
        }

    }
}
