package lab3p2_rigobertobarahona;

import java.util.ArrayList;

public class Especiales extends Carta{
    
    private int vida;


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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

    public Especiales(int vida) {
        this.vida = vida;
    }

    public Especiales() {
    }
    
    public Especiales(String nombre, int elixir, int velocidad, int vida) {
        super(nombre, elixir, velocidad);
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre + "\n"
        + "Costo: " + elixir + "\n"
        + "Velocidad: " + velocidad + "\n"
        + "Vida: " + vida;
    }
    
    
}
