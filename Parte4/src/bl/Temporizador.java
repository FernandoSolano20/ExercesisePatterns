package bl;

import java.util.ArrayList;

public class Temporizador {

    private ArrayList<ClienteTemporizador> temporizador = new ArrayList<>();

    public void registar(ClienteTemporizador cliente){
        this.temporizador.add(cliente);
    }
}
