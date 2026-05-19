package Dia4y5ArrayALFechas;

import java.time.LocalDateTime;

public class AparcamientoMain {
    public static void main(String[] args) {
        Aparcamiento aparcamiento1 = new Aparcamiento("4444EEE", LocalDateTime.now());
        System.out.println(aparcamiento1);
    }
}
