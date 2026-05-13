package Dia3StringSB;

import java.util.ArrayList;
import java.util.Collection;

public class EjPassword {
    public static void main(String[] args) {
        //Generar una contraseña con 2 digitos, 2 mayusculas, 2 minusculas y 2 simbolos
        //String password = ""+minuscula()+minuscula();

        String password ="Euldlmdcunqa";

        System.out.println(password);

        intercambiarPosiciones(password);

       //Hacer un bucle para intercambiar muchas veces
        for (int i = 0; i < 50; i++) {
            password=intercambiarPosiciones(password);
        }

        System.out.println(password);


    }

    private static String intercambiarPosiciones(String password) {
        int posicion1=(int)(Math.random()*(password.length()-1+1));
        int posicion2=(int)(Math.random()*(password.length()-1+1));

        char caracter1 = password.charAt(posicion1);
        char caracter2 = password.charAt(posicion2);

        System.out.println("Pos1 "+posicion1+ " Pos2 "+posicion2);

        StringBuilder passwordSB = new StringBuilder(password);
        passwordSB.setCharAt(posicion1,caracter2);
        passwordSB.setCharAt(posicion2,caracter1);

        System.out.println(passwordSB);

        return passwordSB.toString();



    }

    public static char minuscula(){
        int posicion=(int)(Math.random()*(122-97+1))+97;

        char caracter = (char)posicion;

        return caracter;

    }


}
