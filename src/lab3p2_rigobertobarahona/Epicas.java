package lab3p2_rigobertobarahona;

import java.util.ArrayList;

public class Epicas extends Carta {
    private int ataque;

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Epicas() {
    }

    public Epicas(int ataque) {
        this.ataque = ataque;
    }

    public Epicas(String nombre, int elixir, int velocidad, int ataque) {
        super(nombre, elixir, velocidad);
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return nombre + "\n"
        + "Costo: " + elixir + "\n"
        + "Velocidad: " + velocidad + "\n"
        + "Ataque: " + ataque;
    }
    
}
