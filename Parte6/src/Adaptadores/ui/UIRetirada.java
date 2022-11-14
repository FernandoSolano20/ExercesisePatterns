package Adaptadores.ui;

import Adaptadores.bl.RetiradaEfectivo;
import Adaptadores.ui.InterfazUsuario;

public class UIRetirada {
    InterfazUsuario infoSinFondos(RetiradaEfectivo retiradaEfectivo){
        return new InterfazUsuario(retiradaEfectivo);
    }
}
