package Adaptadores.ui;

import Adaptadores.bl.Deposito;
import Adaptadores.ui.InterfazUsuario;

public class UIDeposito {
    InterfazUsuario infoCantidad(Deposito deposito){
        return new InterfazUsuario(deposito);
    }
}
