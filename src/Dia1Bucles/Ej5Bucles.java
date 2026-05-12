package Dia1Bucles;


import java.util.Scanner;

/*
El empresa tiene el registro de las horas que trabaja diariamente un empleado durante la semana (cinco días) y requiere determinar el total de éstas, así como el sueldo que recibirá por las horas trabajadas. El programa preguntará por las horas trabajadas cada uno de los días de la semana y después mostrará los resultados. El precio/hora es de 15€
* */
public class Ej5Bucles {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // FOR
        int totalHoras=0;
        int horasDia=0;

        System.out.println("**************FOR**************");

        for (int i = 0; i < 5; i++) {
            System.out.println("¿Cuantas horas has trabajado hoy?");
            horasDia = teclado.nextInt();
            totalHoras=totalHoras+horasDia;
        }

        int sueldoTotal= totalHoras*15;
        System.out.println("Horas totales "+totalHoras);
        System.out.println("Sueldo total "+sueldoTotal);

        //WHILE
        System.out.println("**************WHILE**************");
        totalHoras=0;
        horasDia=0;
        int i=0;

        while (i<5){
            System.out.println("¿Cuantas horas has trabajado hoy?");
            horasDia = teclado.nextInt();
            totalHoras=totalHoras+horasDia;
            i++;
        }

        sueldoTotal= totalHoras*15;
        System.out.println("Horas totales "+totalHoras);
        System.out.println("Sueldo total "+sueldoTotal);

        // DO-WHILE
        System.out.println("**************DO-WHILE**************");

        totalHoras=0;
        horasDia=0;
        i=0;

        do{
            System.out.println("¿Cuantas horas has trabajado hoy?");
            horasDia = teclado.nextInt();
            totalHoras=totalHoras+horasDia;
            i++;
        }while (i<5);

        sueldoTotal= totalHoras*15;
        System.out.println("Horas totales "+totalHoras);
        System.out.println("Sueldo total "+sueldoTotal);


    }


}
