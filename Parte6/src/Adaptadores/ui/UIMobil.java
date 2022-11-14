package Adaptadores.ui;

import Adaptadores.bl.RecargaMobil;
import Adaptadores.ui.InterfazUsuario;

public class UIMobil {
    InterfazUsuario infoRecarga(RecargaMobil recargaMobil){
        return new InterfazUsuario(recargaMobil);
    }
}
