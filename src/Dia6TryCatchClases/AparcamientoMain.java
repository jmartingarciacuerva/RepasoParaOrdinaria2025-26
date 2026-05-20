package Dia6TryCatchClases;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AparcamientoMain {
    public static void main(String[] args) {
        Aparcamiento aparcamiento1 = null;

        //Creamos un aparcamiento.
        //Como la fecha de entrada es posterior a hoy, recibiremos un error del constructor
        try {
            aparcamiento1 = new Aparcamiento("4444EEE", LocalDateTime.now().plusDays(1));
        } catch (FechaAparcamientoInvalidaException error) {
            System.out.println(error.getMessage());
        }
        System.out.println(aparcamiento1);


        //Creamos un aparcamiento. Con la fecha de entrada de hace 10 minutos
        try {
            aparcamiento1 = new Aparcamiento("4444EEE", LocalDateTime.now().minusMinutes(10));
        } catch (FechaAparcamientoInvalidaException error) {
            System.out.println(error.getMessage());
        }
        System.out.println(aparcamiento1);
        //Llamamos a saleCoche, con la fecha hora actual
        aparcamiento1.saleCoche(LocalDateTime.now());
        System.out.println(aparcamiento1);//Mostramos los datos, después de salir

        ArrayList<Aparcamiento> aparcamientos = new ArrayList<>();
        aparcamientos.add(aparcamiento1);


        Scanner teclado = new Scanner(System.in);

        System.out.println("ELIGE TU OPCION");
        String opcion = menuOpcion(teclado);
        while (!opcion.equals("5")) {
            switch (opcion) {
                case "1":
                    mostrarTodos(aparcamientos);
                    break;
                case "2":
                    buscarUnAparcamiento(aparcamientos);
                    break;
                case "3":
                    entraVehiculo(aparcamientos);
                    break;
                case "4":
                    saleVehiculo(aparcamientos);
                    break;
            }
            opcion = menuOpcion(teclado);
        }
        System.out.println("Hasta la vista");

    }

    private static void entraVehiculo(ArrayList<Aparcamiento> aparcamientos) {
        System.out.println("**** SALE UN VEHICULO ******");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce matricula");
        String matricula = teclado.nextLine();
        System.out.println("Introduce fecha entrada y hora(dd/MM/yyyy HH:mm):");
        String fecha = teclado.nextLine();
        LocalDateTime fechaEntrada = LocalDateTime.parse(fecha);
        try {
            Aparcamiento aparcamientoNuevo = new Aparcamiento(matricula, fechaEntrada);
            aparcamientos.add(aparcamientoNuevo);
        } catch (FechaAparcamientoInvalidaException error) {
            System.out.println(error.getMessage());
        }
    }

    private static void saleVehiculo(ArrayList<Aparcamiento> aparcamientos) {
        System.out.println("**** SALE UN VEHICULO ******");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce matricula");
        String matricula = teclado.nextLine();
        System.out.println("Introduce fecha entrada y hora(dd/MM/yyyy HH:mm):");
        String fecha = teclado.nextLine();
        LocalDateTime fechaEntrada = LocalDateTime.parse(fecha);
        Aparcamiento aparcamientoBuscado=null;
        try {
            aparcamientoBuscado = new Aparcamiento(matricula, fechaEntrada);
        } catch (FechaAparcamientoInvalidaException error) {
            System.out.println(error.getMessage());
        }

        if (aparcamientos.contains(aparcamientoBuscado)) {
            System.out.println("APARCAMIENTO ENCONTRADO:");
            Aparcamiento aparcamientoEncontrado = aparcamientos.get(aparcamientos.indexOf(aparcamientoBuscado));
            System.out.println(aparcamientoEncontrado);
            System.out.println("Introduce la fecha y hora de salida ");
            String fechaSalida = teclado.nextLine();
            LocalDateTime fechaSalidaEntrada = LocalDateTime.parse(fechaSalida);
            aparcamientoEncontrado.saleCoche(fechaSalidaEntrada);
            System.out.println(aparcamientoEncontrado);
        } else {
            System.out.println("NO SE HA ENCONTRADO ESTE APARCAMIENTO");
        }
    }

    private static void buscarUnAparcamiento(ArrayList<Aparcamiento> aparcamientos) {
        System.out.println("**** BUSCAR UN VEHICULO ******");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce matricula");
        String matricula = teclado.nextLine();
        System.out.println("Introduce fecha entrada y hora(dd/MM/yyyy HH:mm):");
        String fecha = teclado.nextLine();
        LocalDateTime fechaEntrada = LocalDateTime.parse(fecha);
        Aparcamiento aparcamientoBuscado=null;
        try {
            aparcamientoBuscado = new Aparcamiento(matricula, fechaEntrada);
        } catch (FechaAparcamientoInvalidaException error) {
            System.out.println(error.getMessage());
        }

        if (aparcamientos.contains(aparcamientoBuscado)) {
            System.out.println("MATRICULA ENCONTRADA:");
            Aparcamiento aparcamientoEncontrado = aparcamientos.get(aparcamientos.indexOf(aparcamientoBuscado));
            System.out.println(aparcamientoEncontrado);
        } else {
            System.out.println("NO SE HA ENCONTRADO ESTE APARCAMIENTO");
        }
    }

    private static void mostrarTodos(ArrayList<Aparcamiento> aparcamientos) {
        System.out.println("**** MOSTRAR TODOS LOS VEHICULOS ******");
        for (Aparcamiento aparcamiento : aparcamientos) {
            System.out.println(aparcamiento);
        }
    }


    public static String menuOpcion(Scanner teclado) {
        String regex = "[1-5]{1}";
        String opcion = "";
        System.out.println("Opciones:");
        System.out.println("1- MOSTRAR TODOS LOS APARCAMIENTOS");
        System.out.println("2- BUSCAR UN APARCAMIENTO");
        System.out.println("3- ENTRA UN VEHICULO");
        System.out.println("4- SALE UN VEHICULO");
        System.out.println("5- SALIR");
        opcion = teclado.nextLine();
        while (!opcion.matches(regex)) {
            System.out.println("opcion invalida try again");
            opcion = teclado.nextLine();
        }
        return opcion;

    }


}
