package org.example;

public class ImportoNonValidoException extends RuntimeException {
    public ImportoNonValidoException(double importo) {
        super("Importo non valido: %.2f".formatted(importo));
    }
}
