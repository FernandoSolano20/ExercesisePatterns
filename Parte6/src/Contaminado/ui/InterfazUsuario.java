package Contaminado.ui;

import Contaminado.bl.ITransaccion;

public abstract class InterfazUsuario {
    ITransaccion solicitarCantidad(ITransaccion transaccion){
        return transaccion;
    }

    ITransaccion solicitarNCC(ITransaccion transaccion){
        return transaccion;
    }

    ITransaccion solicitarConfirmacion(ITransaccion transaccion){
        return transaccion;
    }

    ITransaccion solicitarCantidadDisponible(ITransaccion transaccion){
        return transaccion;
    }

    ITransaccion informarFondosInsuficientes(ITransaccion transaccion){
        return transaccion;
    }
}
