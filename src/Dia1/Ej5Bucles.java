package Dia1;


import java.util.Scanner;

/*
El empresa tiene el registro de las horas que trabaja diariamente un empleado durante la semana (cinco días) y requiere determinar el total de éstas, así como el sueldo que recibirá por las horas trabajadas. El programa preguntará por las horas trabajadas cada uno de los días de la semana y después mostrará los resultados. El precio/hora es de 15€
* */
public class Ej5Bucles {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int totalHoras=0;
        int horasDia=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("¿Cuantas horas has trabajado hoy?");
            horasDia = teclado.nextInt();
            totalHoras=totalHoras+horasDia;
        }

        int sueldoTotal= totalHoras*15;
        System.out.println("Horas totales "+totalHoras);
        System.out.println("Sueldo total "+sueldoTotal);



    }


}
