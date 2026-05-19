package Dia6TryCatchClases;

import java.time.LocalDateTime;

public class AparcamientoMain {
    public static void main(String[] args) {
        Aparcamiento aparcamiento1=null;

        //Creamos un aparcamiento.
        //Como la fecha de entrada es posterior a hoy, recibiremos un error del constructor
        try {
            aparcamiento1 = new Aparcamiento("4444EEE", LocalDateTime.now().plusDays(1));
        }catch (FechaAparcamientoInvalidaException error){
            System.out.println(error.getMessage());
        }
        System.out.println(aparcamiento1);


        //Creamos un aparcamiento. Con la fecha de entrada de hace 10 minutos
        try {
            aparcamiento1 = new Aparcamiento("4444EEE", LocalDateTime.now().minusMinutes(10));
        }catch (FechaAparcamientoInvalidaException error){
            System.out.println(error.getMessage());
        }
        System.out.println(aparcamiento1);
        //Llamamos a saleCoche, con la fecha hora actual
        aparcamiento1.saleCoche(LocalDateTime.now());
        System.out.println(aparcamiento1);//Mostramos los datos, después de salir



    }
}
