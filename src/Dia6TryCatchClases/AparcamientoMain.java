package Dia6TryCatchClases;

import java.time.LocalDateTime;

public class AparcamientoMain {
    public static void main(String[] args) {
        Aparcamiento aparcamiento1=null;
        try {
            aparcamiento1 = new Aparcamiento("4444EEE", LocalDateTime.now().plusDays(1));
        }catch (FechaAparcamientoInvalidaException error){
            System.out.println(error.getMessage());
        }
        System.out.println(aparcamiento1);


    }
}
