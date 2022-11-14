package Segregacion.ui;

import Segregacion.bl.*;

public class InterfazUsuario implements  UIDeposito, UIConsulta, UITransfer, UIMobil, UIRetirada {

    ITransaccion leerEntrada(ITransaccion transaccion){
        return transaccion;
    }

    ITransaccion mostrarInfo(ITransaccion transaccion){
        return transaccion;
    }

    @Override
    public void infoSaldo(Consulta consulta) {

    }

    @Override
    public void infoCantidad(Deposito deposito) {

    }

    @Override
    public void infoRecarga(RecargaMobil recargaMobil) {

    }

    @Override
    public void infoSinFondos(RetiradaEfectivo retiradaEfectivo) {

    }

    @Override
    public void infoCunenta(Transferencia transferencia) {

    }
}
