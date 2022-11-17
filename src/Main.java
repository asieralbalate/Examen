import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carta c = new Carta(10, "♥");
        System.out.println(c);
        Mazo m = new Mazo(1);
        System.out.println(m);
        Jugador j = new Jugador("As");
        boolean gameOver = false;
        while (!gameOver){
            System.out.println(j);
            System.out.println(j.getPuntuacion());
            System.out.println("¿Otra carta? (S/N)");
            String respuesta = input.next().toUpperCase();
            if (respuesta.equals("S")){
                j.repartirCarta(m.extraerCarta());
                int puntuacion = j.getPuntuacion();
                if (puntuacion > 21) {
                    gameOver = true;
                }
            }
            else {
                gameOver = true;
            }
        }
        if (j.getPuntuacion() > 21) {
            System.out.println(j);
            System.out.println(j.getPuntuacion());
            System.out.println("Perdes!!");
        }
    }
}
