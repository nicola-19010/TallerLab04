package guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaJugadores extends Ventana implements ActionListener {
    private JButton editarJugadorBtn;
    private JButton guardarCambiosBtn;
    private JButton volverBtn;

    public VentanaJugadores(){
        this.setTitle("Jugadores");

        this.generarEtiqueta("Informacion oficial: ", 20, 10, 150, 20);



        editarJugadorBtn = generarBoton("Editar ",  20, 200, 80, 60);
        guardarCambiosBtn = generarBoton("Guardar",120,200,100,60);
        volverBtn = generarBoton("Salir", 240 , 200, 80, 60);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
