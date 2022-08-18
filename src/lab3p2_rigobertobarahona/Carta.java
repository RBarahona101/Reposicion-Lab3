package lab3p2_rigobertobarahona;

import java.util.ArrayList;
public class Carta {
    String nombre;
    int elixir;
    int velocidad;

    public Carta() {
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

    public Carta(String nombre, int elixir, int velocidad) {
        this.nombre = nombre;
        this.elixir = elixir;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return nombre + "\n"
        + "Costo: " + elixir + "\n"
        + "Velocidad: " + velocidad;
    }
    
    
}
