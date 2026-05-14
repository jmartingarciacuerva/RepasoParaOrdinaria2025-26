package Dia4y5ArrayALFechas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class EjerciciosArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres= new ArrayList<>();

        nombres.add("Pepe");
        nombres.add("Pepe1");
        nombres.add("Pepe2");
        nombres.add("Pepe3");

        nombres.addAll(Arrays.asList(new String[]{"Juan", "Juan1", "Juan2"}));
        Collections.addAll(nombres,"Ana","Ana1");


        System.out.println("Nombres");
        System.out.println(nombres);
        for (String nombre:nombres){
            System.out.println(nombre);
        }



    }
}
