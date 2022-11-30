package guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEquipos extends Ventana implements ActionListener {
    private JButton jugadoresBtn;
    private JButton salirBtn;

    public VentanaEquipos(){
        this.setTitle("Equipos");

        this.generarEtiqueta("Selecciona equipo: ", 20, 100, 150, 20);
        this.generarEtiqueta("Ranking FIFA: ", 20, 150, 100, 20);

        jugadoresBtn = generarBoton("Jugadores",  20, 200, 100, 60);
        salirBtn = generarBoton("Salir", 120 , 200, 100, 60);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
