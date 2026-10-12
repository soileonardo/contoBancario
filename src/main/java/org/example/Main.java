package org.example;

public class Main {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(100);

        try {
            conto.preleva(150);
        } catch (SaldoInsufficienteException e) {
            IO.println(e.getMessage());
            IO.println("Deficit: " + e.getDeficit());
        }

        try {
            conto.preleva(-20);
        } catch (ImportoNonValidoException e) {
            IO.println(e.getMessage());
        } catch (SaldoInsufficienteException e) {
            IO.println(e.getMessage());
        }

        try {
            conto.preleva(40);
            System.out.println("Prelievo completato. Saldo: " + conto.getSaldo());
        } catch (SaldoInsufficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
