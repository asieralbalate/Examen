public class Mazo {
    public Carta[] carta;
    public int numeroBarajas;
    public static final int NUMERO_CARTAS = 52;
    public int cartasQuedan;

    public Mazo(int numeroBarajas){
        cartasQuedan = numeroBarajas * NUMERO_CARTAS;
        carta = new Carta[NUMERO_CARTAS * numeroBarajas];
        int i = 0;
        for (int j = 0; j < numeroBarajas; j++){
            for (int palo = 0; palo < 4; palo++){
                for(int numero = 1; numero <= 13; numero++){
                    carta[i] = new Carta(numero, Carta.PALOS[palo]);
                    i++;
                }
            }
        }
    }
    public void barajar(){
        for (int i = 0; i < 1000; i++){
            int n1 = (int)(Math.random() * (carta.length));
            int n2 = (int)(Math.random() * (carta.length));
            Carta c = carta[n1];
            carta[n1] = carta[n2];
            carta[n2] = c;
        }
        System.out.println();
    }
    public Carta extraerCarta(){
        cartasQuedan--;
        return carta[cartasQuedan];
    }

    public String toString() {
        String s = "";
        for (int palo = 0; palo < 4; palo++){
            Boolean primeraCarta = true;
            for (int i = 0; i < (cartasQuedan); i++){
                if (carta[i].getPalo().equals(Carta.PALOS[palo])){
                    if (primeraCarta){
                        primeraCarta = false;
                    } else {
                        s += ", ";
                    }
                    s += carta[i];
                }
            }
            s += "\n";
        }
        return s;
    }
}
