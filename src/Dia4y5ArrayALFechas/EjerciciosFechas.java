package Dia4y5ArrayALFechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EjerciciosFechas {
    public static void main(String[] args) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate otraFecha = LocalDate.of(2011,5,4);
        LocalDate fechaNula= null;

        //Las mostramos sin formato
        System.out.println(fechaHoy);
        System.out.println(fechaHoy);
        System.out.println(fechaNula);

        //Creamos un formato
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("eee dd MMMM uuuu");
        System.out.println(fechaHoy.format(formato));
        //   System.out.println(fechaNula.format(formato)); //La fecha EXPLOTA

        //Pedimos una fecha con formato
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce fecha (dd/MM/yyyy): ");
        String fechaString = teclado.nextLine(); //Pedimos una fecha y la guardamos como String
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Creamos un formato para esta fecha
        LocalDate fechaUsuario= LocalDate.parse(fechaString,formato2);
        //Generamos un LocalDate con el String y el formato, si no coindicen EXPLOTA

        System.out.println(fechaUsuario.format(formato));//Mostramos con el primer formato








    }
}
