package bl;

import java.util.ArrayList;

public class Temporizador {

    ArrayList<ClienteTemporizador> temporizadores = new ArrayList<>();

    String registar(ClienteTemporizador clienteTemporizador){
        temporizadores.add(clienteTemporizador);
        return "Registrado";
    }
}
