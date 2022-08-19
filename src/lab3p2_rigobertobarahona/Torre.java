package lab3p2_rigobertobarahona;

import java.util.ArrayList;
public class Torre {
    int vida;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Torre() {
    }

    public Torre(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Vida: " + vida;
    }
    
}
