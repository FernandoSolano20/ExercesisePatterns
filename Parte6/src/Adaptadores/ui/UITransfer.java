package Adaptadores.ui;

import Adaptadores.bl.Transferencia;
import Adaptadores.ui.InterfazUsuario;

public class UITransfer {
    InterfazUsuario infoCuenta(Transferencia transferencia){
        return new InterfazUsuario(transferencia);
    }
}
