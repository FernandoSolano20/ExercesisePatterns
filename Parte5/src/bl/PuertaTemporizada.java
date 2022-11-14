package bl;

public class PuertaTemporizada extends Puerta{
    AdaptadorPuertaTemporizador adaptador;
    Temporizador temporizador = new Temporizador();

    String timeout(){
        adaptador = new AdaptadorPuertaTemporizador(this);
        temporizador.registar(adaptador);
        return "Tiempo espera";
    }
}
