package Adaptadores.ui;

import Contaminado.bl.ITransaccion;

public class InterfazUsuario {
    public InterfazUsuario(ITransaccion transaccion) {
    }

    ITransaccion leerEntrada(ITransaccion transaccion){
        return transaccion;
    }

    ITransaccion mostrarInfo(ITransaccion transaccion){
        return transaccion;
    }
}
