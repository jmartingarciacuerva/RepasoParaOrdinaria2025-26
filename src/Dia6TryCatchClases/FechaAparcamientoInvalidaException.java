package Dia6TryCatchClases;

import java.time.DateTimeException;

public class FechaAparcamientoInvalidaException extends DateTimeException {

    public FechaAparcamientoInvalidaException(String message) {
        super(message);
    }
}
