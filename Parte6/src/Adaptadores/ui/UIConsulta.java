package Adaptadores.ui;

import Adaptadores.bl.Consulta;
import Adaptadores.ui.InterfazUsuario;

public class UIConsulta {
    InterfazUsuario infoSaldo(Consulta consulta){
        return new InterfazUsuario(consulta);
    }
}
