package guis;

import modelo.Seleccion;
import modelo.SeleccionNoEncontradaException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaEquipos extends Ventana implements ActionListener {

    private JLabel ranking;
    private JLabel bandera;
    private ArrayList<Seleccion> selecciones;
    private JButton informacionBtn;

    private JButton jugadoresBtn;
    private JButton salirBtn;


    private JComboBox comboBoxSelecciones;

    private Seleccion seleccionElejida; //experimental

    public VentanaEquipos(ArrayList<Seleccion> selecciones) {
        /*this.selecciones = selecciones;

        this.setTitle("Equipos");
        this.generarEtiqueta("Selecciona equipo: ", 20, 100, 150, 20);
        this.generarEtiqueta("Ranking FIFA: ", 20, 150, 100, 20);
        rankingFIFAEligida = this.generarEtiqueta("________", 150, 150, 80, 20);



        comboBoxSelecciones = generarComboBoxSelecciones(selecciones, 30,20,150,30);



        okBtn = generarBoton("OK", 80,65,60,35);
        jugadoresBtn = generarBoton("Jugadores", 20, 200, 100, 60);
        jugadoresBtn.addActionListener(this);
        salirBtn = generarBoton("Salir", 130, 200, 100, 60);
        salirBtn.addActionListener(this);*/

        this.selecciones = selecciones;

        this.setTitle("Selecciones");

        this.generarEtiqueta("Selecciona equipo: ", 20, 50, 120, 20);
        this.generarEtiqueta("Ranking FIFA: ", 20, 150, 110, 20);

        jugadoresBtn = this.generarBoton("Salir", 200, 200, 150, 30);
        jugadoresBtn.addActionListener(this);

        salirBtn = this.generarBoton("Jugadores", 20, 200, 150, 30);
        salirBtn.addActionListener(this);

        informacionBtn = this.generarBoton("Informacion", 150, 260, 150, 30);
        informacionBtn.addActionListener(this);

        ranking = this.generarEtiqueta("", 150, 150, 300, 20);
        bandera = this.generarEtiqueta("", 250, 10, 200, 250);


        comboBoxSelecciones = this.generarComboBoxSelecciones(selecciones, 20, 100, 150, 20);
    }

    public void mostrarInformacionSeleccion() throws SeleccionNoEncontradaException {/*
        Seleccion s = null;
        try {
            s = Seleccion.buscarSeleccionPorNombre(comboBoxSelecciones.getSelectedItem().toString(), this.selecciones);
        } catch (SeleccionNoEncontradaException e) {
            throw new RuntimeException(e);
        }
        s.getRanking();

        ranking.setText(s.getRanking());*/

        Seleccion s = Seleccion.buscarSeleccionPorNombre(comboBoxSelecciones.getSelectedItem().toString(), this.selecciones);
        ranking.setText(s.getRanking());
        bandera.setIcon(new ImageIcon("./src/main/resources/"+s.getBandera()));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == informacionBtn) {
            try {
                mostrarInformacionSeleccion();
            } catch (SeleccionNoEncontradaException ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == jugadoresBtn){
            //this.dispose();
            try {
                new VentanaJugadores(Seleccion.buscarSeleccionPorNombre(comboBoxSelecciones.getSelectedItem().toString(), this.selecciones));
            } catch (SeleccionNoEncontradaException ex) {
                ex.printStackTrace();
            }
        } else if(e.getSource() == salirBtn) {
            System.exit(0);
        }
    }
}