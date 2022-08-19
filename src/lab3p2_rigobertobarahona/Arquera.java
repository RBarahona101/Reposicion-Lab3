package lab3p2_rigobertobarahona;

import java.util.ArrayList;
public class Arquera extends Torre {
    private int ataque; 

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arquera(int ataque) {
        this.ataque = ataque;
    }

    public Arquera(int vida, int ataque) {
        super(vida);
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Vida: " + vida + "\n"
        + "Ataque: " + ataque;        
    }
    
}
