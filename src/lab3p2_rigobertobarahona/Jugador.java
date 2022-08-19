package lab3p2_rigobertobarahona;

import java.util.ArrayList;

public class Jugador {
    String nombre;
    ArrayList<Carta> cards;
    ArrayList<Torre> towers;
    
    public Jugador(){
        
    }

    public int getArcherTowerCant (){
        int cont = 0;
        for (Object temp : towers) {
            if (temp instanceof Arquera) {
                cont++;
            }
        }
        return cont;
    }
    
    public int getKingTowerCant (){
        int cont = 0;
        for (Object temp : towers) {
            if (temp instanceof Rey){
                cont++;
            }
        }
        return cont;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Carta> cards) {
        this.cards = cards;
    }

    public ArrayList<Torre> getTowers() {
        return towers;
    }

    public void setTowers(ArrayList<Torre> towers) {
        this.towers = towers;
    }

    public Jugador(String nombre, ArrayList<Carta> cards, ArrayList<Torre> towers) {
        this.nombre = nombre;
        this.cards = cards;
        this.towers = towers;
    }
    
    public String listarCartas() {
        String temp = "";
        for (int i = 0; i < cards.size(); i++) {
            temp += "" + i + " - " + cards.get(i) + "\n";
        }
        return temp;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
