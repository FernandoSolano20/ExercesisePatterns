package bl;

public class AdaptadorPuertaTemporizador implements ClienteTemporizador {

    public AdaptadorPuertaTemporizador(PuertaTemporizada puertaTemporizada) {
    }

    @Override
    public String timeout() {
        return "Esperar tiempo";
    }
}
