package lab3p2_rigobertobarahona;

import java.util.ArrayList;
public class Legendarias extends Carta {
    private int vida;
    private int ataque;

    public Legendarias() {
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

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

    public Legendarias(int vida, int ataque) {
        this.vida = vida;
        this.ataque = ataque;
    }

    public Legendarias(String nombre, int elixir, int velocidad, int vida, int ataque) {
        super(nombre, elixir, velocidad);
        this.vida = vida;
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return nombre + "\n"
        + "Costo: " + elixir + "\n"
        + "Velocidad: " + velocidad + "\n"
        + "Vida: " + vida + "\n"
        + "Ataque: " + ataque;        
    }
    
    
}
