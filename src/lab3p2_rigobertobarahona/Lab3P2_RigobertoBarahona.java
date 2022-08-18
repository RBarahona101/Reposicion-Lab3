package lab3p2_rigobertobarahona;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Lab3P2_RigobertoBarahona {

    static Random r = new Random();
    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Carta> carta = new ArrayList();
        ArrayList<Jugador> jugador = new ArrayList();
        ArrayList<Torre> torre = new ArrayList();

        boolean flag = true;

        while (flag == true) {

            System.out.println("0) Salir");
            System.out.println("1) Crear Jugador");
            System.out.println("2) Anadir Carta a Jugador");
            System.out.println("3) Anadir Torre Arquera a Jugador");
            System.out.println("4) Anadir Torre Rey a Jugador");
            System.out.println("5) Editar Jugador");
            System.out.println("6) Eliminar Jugador");
            System.out.println("7) Listar Jugador");
            System.out.println("8) Listar Jugadores");
            System.out.println("9) Eliminar Torre Arquera de Jugador");
            System.out.println("10) Eliminar Torre Rey de Jugador");
            System.out.println("11) Listar Torres de Jugador");
            System.out.println("12) Eliminar Carta de Jugador");
            System.out.println("13) Listar Cartas de Jugador");
            System.out.println("14 Simulacion de Juego");
            System.out.print("Seleccionar Opcion: ");
            int opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    Scanner lea = new Scanner(System.in);
                    System.out.print("Ingresar nombre: ");
                    String nombre = lea.nextLine();
                    ArrayList<Carta> cards = new ArrayList();
                    ArrayList<Torre> towers = new ArrayList();
                    jugador.add(new Jugador(nombre, cards, towers));
                    break;
                }
                case 2: {
                    boolean posible = true;
                    if (jugador.isEmpty()) {
                        System.out.println("No hay Jugadores ingresados");
                    } else {
                        if (carta.isEmpty()) {
                            Scanner lea = new Scanner(System.in);
                            System.out.print("Nombre de Carta: ");
                            String nombre = lea.nextLine();
                            System.out.print("Costo de Elixir [1-10]: ");
                            int elixir = lea.nextInt();
                            while (elixir < 1 || elixir > 10) {
                                System.out.print("Costo de Elixir [1-10]: ");
                                elixir = lea.nextInt();
                            }
                            System.out.print("Velocidad: ");
                            int velocidad = lea.nextInt();
                            System.out.println("1) Especial");
                            System.out.println("2) Epicas");
                            System.out.println("3) Legendarias");
                            System.out.print("Eligir tipo: ");
                            int opcion2 = lea.nextInt();
                            switch (opcion2) {
                                case 1: {
                                    System.out.print("Vida: ");
                                    int vida = lea.nextInt();
                                    carta.add(new Especiales(nombre, elixir, velocidad, vida));
                                    break;
                                }
                                case 2: {
                                    System.out.print("Ataque: ");
                                    int ataque = lea.nextInt();
                                    carta.add(new Epicas(nombre, elixir, velocidad, ataque));
                                    break;
                                }
                                case 3: {
                                    System.out.print("Vida: ");
                                    int vida = lea.nextInt();
                                    System.out.print("Ataque: ");
                                    int ataque = lea.nextInt();
                                    carta.add(new Legendarias(nombre, elixir, velocidad, vida, ataque));
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion invalida");
                                    posible = false;
                                    break;
                                }
                            }
                        } else {
                            System.out.println("1) Crear Nueva");
                            System.out.println("2) Agregar Existente");
                            System.out.print("Seleccionar opcion: ");
                            int opcion2 = lea.nextInt();
                            switch (opcion2) {
                                case 1: {
                                    Scanner lea = new Scanner(System.in);
                                    System.out.print("Nombre de Carta: ");
                                    String nombre = lea.nextLine();
                                    System.out.print("Costo de Elixir [1-10]: ");
                                    int elixir = lea.nextInt();
                                    while (elixir < 1 || elixir > 10) {
                                        System.out.print("Costo de Elixir [1-10]: ");
                                        elixir = lea.nextInt();
                                    }
                                    System.out.print("Velocidad: ");
                                    int velocidad = lea.nextInt();

                                    System.out.println("1) Especial");
                                    System.out.println("2) Epicas");
                                    System.out.println("3) Legendarias");
                                    System.out.print("Eligir tipo: ");
                                    int opcion3 = lea.nextInt();
                                    switch (opcion3) {
                                        case 1: {
                                            System.out.print("Vida: ");
                                            int vida = lea.nextInt();
                                            carta.add(new Especiales(nombre, elixir, velocidad, vida));
                                            break;
                                        }
                                        case 2: {
                                            System.out.print("Ataque: ");
                                            int ataque = lea.nextInt();
                                            carta.add(new Epicas(nombre, elixir, velocidad, ataque));
                                            break;
                                        }
                                        case 3: {
                                            System.out.print("Vida: ");
                                            int vida = lea.nextInt();
                                            System.out.print("Ataque: ");
                                            int ataque = lea.nextInt();
                                            carta.add(new Legendarias(nombre, elixir, velocidad, vida, ataque));
                                            break;
                                        }
                                        default: {
                                            System.out.println("Opcion invalida");
                                            posible = false;
                                            break;
                                        }
                                    }
                                }
                                case 2: {
                                    System.out.println("Exitos");
                                    break;
                                }
                                default: {
                                    System.out.println("Opcion invalida");
                                    posible = false;
                                    break;
                                }
                            }
                        }
                    }
                    if (posible == true) {
                        String salida = "";
                        for (Object temp : jugador) {
                            if (temp instanceof Jugador) {
                                salida += jugador.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);
                        System.out.println("Ingrece indice de Jugador a agregar: ");
                        int indice1 = lea.nextInt();
                        System.out.println();
                        salida = "";
                        for (Object temp : carta) {
                            if (temp instanceof Carta) {
                                salida += carta.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);
                        System.out.print("Indice de Carta a agregar: ");
                        int indice2 = lea.nextInt();
                        ((Jugador) jugador.get(indice1)).getCards().add((Carta) carta.get(indice2));
                    } else {
                        System.out.println("Hubo un error");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Vida: ");
                    int vida = lea.nextInt();
                    System.out.println("");
                }

                case 13: {
                    if (jugador.isEmpty()) {
                        System.out.println("No Hay Jugadores");
                    } else {
                        String salida = "";
                        for (Object temp : jugador) {
                            if (temp instanceof Jugador) {
                                salida += jugador.indexOf(temp) + " - " + temp + "\n";
                            }
                        }
                        System.out.println(salida);
                        System.out.print("Ingrece indice de Jugador a listar cartas: ");
                        int indice = lea.nextInt();
                        System.out.println( ((Jugador) jugador.get(indice)).listarCartas()) ;
                    }
                    break;
                }
                default: {
                    flag = false;
                    System.out.println("epico");
                    break;
                }
            } //Switch
        } //Flag
    } //Main
}
