package Dia4y5ArrayALFechas;

import java.util.Arrays;

public class EjerciciosArrays {
    public static void main(String[] args) {
        //Array => Tamaño fijo
        String[] muchosNombres = new String[6]; //Indicamos el tamaño. El array esta vacío
        String[] muchosFrutas = {"Pera", "Melon", "Naranja", "Platano"}; //Indicamos el contenido

        //Introducimos varios nombres en el primer array, que está vacío
        for (int i = 0; i <6; i++) { //Las posiciones empiezan en 0
            muchosNombres[i]="Pepe"+i;
        }
        //Para mostrar usamos un bucle
        System.out.println("*********Nombres*******");
        for(String nombre:muchosNombres){
            System.out.println(nombre);
        }
        System.out.println("*********Frutas*******");
        for(String fruta:muchosFrutas){
            System.out.println(fruta);
        }


        //Si tratamos de acceder a una posicion que no existe, el programa EXPLOTA
        //System.out.println(muchosNombres[6]);


        //Usamos la clase Arrays, para manejar arrays fijos
        //Ej: Ordenamos los elementos de un array
        Arrays.sort(muchosFrutas);
        System.out.println("*********Frutas*******");
        for(String fruta:muchosFrutas){
            System.out.println(fruta);
        }






    }

}
