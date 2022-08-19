package lab3p2_rigobertobarahona;

import java.util.ArrayList;

public class Batalla {
    
    private ArrayList<Jugador> jugador = new ArrayList();
    private ArrayList<Carta> carta = new ArrayList();
    private ArrayList<Torre> torre = new ArrayList();

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Carta> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<Carta> carta) {
        this.carta = carta;
    }

    public ArrayList<Torre> getTorre() {
        return torre;
    }

    public void setTorre(ArrayList<Torre> torre) {
        this.torre = torre;
    }

    public Batalla() {
    }

    public Batalla(ArrayList<Jugador> jugador, ArrayList<Carta> carta, ArrayList<Torre> torre) {
        this.jugador = jugador;
        this.carta = carta;
        this.torre = torre;
    }
}
