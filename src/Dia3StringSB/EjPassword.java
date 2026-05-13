package Dia3StringSB;

public class EjPassword {
    public static void main(String[] args) {
        //Generar una contraseña con 2 digitos, 2 mayusculas, 2 minusculas y 2 simbolos
        String password = ""+minuscula()+minuscula();


        System.out.println(password);



    }

    public static char minuscula(){
        int posicion=(int)(Math.random()*(122-97+1))+97;

        char caracter = (char)posicion;

        return caracter;

    }


}
