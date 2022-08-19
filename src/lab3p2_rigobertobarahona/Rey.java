package lab3p2_rigobertobarahona;

import java.util.ArrayList;
public class Rey extends Torre{
    private String reino;

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Rey() {
    }

    public Rey(int vida, String reino) {
        super(vida);
        this.reino = reino;
    }

    @Override
    public String toString() {
        return "Vida: " + vida + "\n"
        + "Reino: " + reino;  
    }
    
}
