package guis;

import modelo.Seleccion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaEquipos extends Ventana implements ActionListener {
    private ArrayList<Seleccion> selecciones;

    private JButton jugadoresBtn;
    private JButton salirBtn;

    private JComboBox comboBoxSelecciones;

    public VentanaEquipos(ArrayList<Seleccion> selecciones) {
        this.selecciones = selecciones;
        this.setTitle("Equipos");
        this.generarEtiqueta("Selecciona equipo: ", 20, 100, 150, 20);
        this.generarEtiqueta("Ranking FIFA: ", 20, 150, 100, 20);

        comboBoxSelecciones = generarComboBox(selecciones, 30,20,300,30);


        jugadoresBtn = generarBoton("Jugadores", 20, 200, 100, 60);
        jugadoresBtn.addActionListener(this);
        salirBtn = generarBoton("Salir", 120, 200, 100, 60);
        salirBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jugadoresBtn) {
            //new VentanaJugadores(this.seleccion);
            //this.dispose();
        }
    }
}