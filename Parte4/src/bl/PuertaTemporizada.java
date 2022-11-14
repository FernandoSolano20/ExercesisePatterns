package bl;

public class PuertaTemporizada extends Puerta implements ClienteTemporizador{

    @Override
    public void timeout() {
        System.out.println("Tiempo esperando");
    }
}
