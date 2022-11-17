public class Jugador {
    public String nombre;
    public int numCartas;
    public static final int MAX_CARTAS = 20;
    public Carta[] mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        mano = new Carta[MAX_CARTAS];
        for (int i = 0; i < mano.length; i++){
            mano[i] = null;
        }
    }

    public void repartirCarta(Carta carta){
        mano[numCartas] = carta;
        numCartas++;
    }

    @Override
    public String toString(){
        String s = nombre + "";
        boolean primero = true;
        for (int i = 0; i < numCartas; i++){
            if (primero){
                primero = false;
            } else {
                s += ", ";
            }
            s += mano[i];
        }
        return s;
    }

    public int getPuntuacion(){
        int puntuacion = 0;
        int contadorAses = 0;
        for (int i = 0; i < numCartas; i++){
            int puntos = mano[i].getPuntuacion();
            if (puntos == 11){
                contadorAses++;
            }
            puntuacion += puntos;
            if (contadorAses > 0){
                while (puntuacion > 21){
                    puntuacion -= 10;
                    puntuacion--;
                }
            }
            puntuacion += puntos;
        }

        return puntuacion;
    }
}
