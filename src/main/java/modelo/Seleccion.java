package modelo;

import java.util.ArrayList;

public class Seleccion {
    private String id;
    private String nombre;
    private String ranking;

    private String bandera;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public Seleccion(String id, String nombre, String ranking, String bandera, ArrayList<Jugador> jugadores) {
        this.id = id;
        this.nombre = nombre;
        this.ranking = ranking;
        this.jugadores = jugadores;
        this.bandera = bandera;
    }

    public String getBandera() {
        return bandera;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
