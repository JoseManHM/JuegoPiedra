package juegopiedrapapelotijera;

import java.util.Scanner;

/**
 *
 * Programa que simula el juego piedra, papel o tijera, donde juega la computadora contra el jugador,
 * además muestra la puntuación del juego y después de cada juego pide un mensaje donde pregunta si se
 * quiere seguir jugando o no.
 */
public class JuegoPiedraPapeloTijera {
    static int PuntJug=0, PuntPC=0;
    public static void main(String[] args) {
     Game();
    }
    public static void Game(){
        int JugElecc;
        int PCElecc = (int)(Math.random()*3)+1;
        Scanner numJug = new Scanner(System.in);
        System.out.println("Introduce un número entre 1 y 3\n1 Piedra\n2 Papel\n3 Tijera\n");
        JugElecc = numJug.nextInt();
        if(JugElecc <1 || JugElecc >3){
            Game();
        }
        if(JugElecc==1&&PCElecc==1){
            System.out.println("Empate\nJugador: piedra\nPC: piedra");
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        } else if (JugElecc==1 && PCElecc==2) {
            System.out.println("Gana PC\nJugador: piedra\nPC: papel");
            PuntPC++;
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        } else if (JugElecc==1 && PCElecc==3) {
            System.out.println("Gana jugador\nJugador: piedra\nPC: tijera");
            PuntJug++;
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        } else if (JugElecc==2 && PCElecc==1){
            System.out.println("Gana jugador\nJugador: papel\nPC: Piedra");
            PuntJug++;
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        } else if (JugElecc==2 && PCElecc==2) {
            System.out.println("Empate\nJugador: tijera\nPC: tijera");
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        } else if (JugElecc==2 && PCElecc==3) {
            System.out.println("Gana PC\nJugador: papel\nPC: Tijera");
            PuntPC++;
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        } else if (JugElecc==3 && PCElecc==1) {
            System.out.println("Gana PC\nJugador: Tijera\nPC: Piedra");
            PuntPC++;
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        } else if (JugElecc==3 && PCElecc==2) {
            System.out.println("Gana jugador\nJugador: Tijera\nPC: Papel");
            PuntJug++;
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        } else if (JugElecc==3 && PCElecc==3){
            System.out.println("Empate\nJugador: Tijera\nPC: Tijera");
            System.out.println("-- Puntuación --\nJugador: "+PuntJug+"\nPC: "+PuntPC);
        }
        ContinuarGame();
    }
    public static void ContinuarGame(){
        String continuaG;
        Scanner seguir = new Scanner(System.in);
        System.out.println("¿Deseas seguir jugando?(s/n)");
        continuaG = seguir.nextLine();
        if(continuaG.equalsIgnoreCase("s")){
            Game();
        } else if(continuaG.equalsIgnoreCase("n")){
            System.out.println("\n\tAdios :)");
            System.exit(0);
        } else {
            ContinuarGame();
        }
    }
}
