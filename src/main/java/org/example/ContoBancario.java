package org.example;

public class ContoBancario {
    private double saldo;

    public ContoBancario(double s) {
        this.saldo = s;
    }

    public double getSaldo() { return this.saldo; }

    public void preleva(double importo) throws SaldoInsufficienteException {
        if (importo <= 0.0) {
            throw new ImportoNonValidoException(importo);
        } else if (importo > saldo) {
            throw new SaldoInsufficienteException(saldo, importo);
        }
        saldo -= importo;
    }
}