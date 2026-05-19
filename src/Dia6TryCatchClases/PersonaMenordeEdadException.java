package Dia6TryCatchClases;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class PersonaMenordeEdadException extends IllegalArgumentException {
    public PersonaMenordeEdadException(String strings) {
        super(strings);
    }
}
