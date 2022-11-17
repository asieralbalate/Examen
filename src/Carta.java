
public class Carta {
    private int numero;
    public String palo;
    public static final String[] PALOS =  {"♠","♥","♦","♣"};
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public String getPalo() {
        return palo;
    }
    public int getPuntuacion(){
        if (numero == 1){
            return 11;
        }
        if (numero <= 10){
            return numero;
        } else {
            return 10;
        }
    }

    @Override
    public String toString(){
        String s = " ";
        if (numero <= 10){
            s += numero;
        } else {
            switch (numero) {
                case 11: s += "J";
                break;
                case 12: s += "Q";
                break;
                case 13: s += "K";
                break;
            }
        }
        if (palo.equals("♠")){
            s += " de ♠";
        } else if (palo.equals("♥")){
            s += " de ♥";
        } else if (palo.equals("♦")) {
            s += " de ♦";
        } else if (palo.equals("♣")){
            s += " de ♣";
        }
        return s;
    }

}
