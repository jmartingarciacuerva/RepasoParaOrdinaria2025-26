package Dia5RegExp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EjerciciosRegExp {
    public static void main(String[] args) {

        altaAparcamiento();



    }

    private static void altaAparcamiento(){
        Scanner teclado = new Scanner(System.in);
        String matriculaRegExp="[0-9]{4}[B-DF-HJ-NP-TV-Z]{3}";
        String matriculaRegExp1="[A-Z]{1,2}-[0-9]{4}-[A-Z]{1,2}";
/*
        System.out.println("Introduce matricula ");
        String matricula = teclado.nextLine();

        if(Pattern.matches(matriculaRegExp,matricula)){
            System.out.println("Correcta");
        }else{
            System.out.println("Incorrecta");
        }
        */
        String matricula;
        do {
            System.out.println("Introduce matricula ");
            matricula = teclado.nextLine();

            if(Pattern.matches(matriculaRegExp,matricula) ||
            Pattern.matches(matriculaRegExp1,matricula)){
                System.out.println("Matricula introducida correctamente");
            }else{
                System.out.println("Matricula Incorrecta. El formato es 1111BBB");
            }

        }while(!(Pattern.matches(matriculaRegExp,matricula)||Pattern.matches(matriculaRegExp1,matricula)));






    }




}
