package Dia6TryCatchClases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosTryCatch {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad :");
        int numero=0;
        try {

            numero = teclado.nextInt();
            if(numero<18){
                throw new PersonaMenordeEdadException("La persona es menor de edad");
            }



        }catch (InputMismatchException error){
            System.out.println("Debes introducir solo numeros");

        }catch (PersonaMenordeEdadException error){
            System.out.println(error.getMessage());

        }
        System.out.println(numero);




    }
}
