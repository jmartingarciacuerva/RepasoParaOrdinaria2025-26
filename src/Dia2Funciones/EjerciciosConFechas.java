package Dia2Funciones;

import java.util.Scanner;

public class EjerciciosConFechas {
    public static void main(String[] args) {
        int diaFechaInicial, mesFechaInicial, anyoFechaInicial;
        int diaFechaFinal, mesFechaFinal, anyoFechaFinal;
        Scanner teclado= new Scanner(System.in);
        boolean laFechaNoEsCorrecta = true;

        //Pedimos la primera fecha. Si la fecha es incorrecta, volvemos a pedirla
        do {
            System.out.print("Introduzca el día de la primera fecha: ");
            diaFechaInicial = teclado.nextInt();
            System.out.print("Introduzca el mes de la primera fecha: ");
            mesFechaInicial = teclado.nextInt();
            System.out.print("Introduzca el año de la primera fecha: ");
            anyoFechaInicial = teclado.nextInt();
            if (esFechaCorrecta(diaFechaInicial, mesFechaInicial, anyoFechaInicial)){
                laFechaNoEsCorrecta=false;
            }else{
                System.out.println("***************** ERROR **********************************");
                System.out.println("La fecha introducida no es correcta. Vuelva a introducirla\n\n");
            }
        }while (laFechaNoEsCorrecta);


        //Pedimos la segunda fecha. Si la fecha es incorrecta, volvemos a pedirla
        laFechaNoEsCorrecta=true;
        do {
            System.out.print("\nIntroduzca el día de la segunda fecha: ");
            diaFechaFinal = teclado.nextInt();
            System.out.print("Introduzca el mes de la segunda fecha: ");
            mesFechaFinal = teclado.nextInt();
            System.out.print("Introduzca el año de la segunda fecha: ");
            anyoFechaFinal = teclado.nextInt();
            if (esFechaCorrecta(diaFechaFinal, mesFechaFinal, anyoFechaFinal)){
                laFechaNoEsCorrecta=false;
            }else{
                System.out.println("***************** ERROR **********************************");
                System.out.println("La fecha introducida no es correcta. Vuelva a introducirla\n\n");
            }
        }while (laFechaNoEsCorrecta);

        System.out.println("Dias entre dos fechas: "+numeroDiasEntreDosFechas(diaFechaInicial,mesFechaInicial,anyoFechaInicial,diaFechaFinal,mesFechaFinal,anyoFechaFinal));

        // Pruebas de las distintas funciones

        //System.out.println("Fecha correcta "+esFechaCorrecta(32,1,2020));

        //System.out.println("Dias que faltan para terminar mes "+ diasParaTerminarMes(20,4,2021));
        //System.out.println("Dias de meses completos hasta terminar un año "+diasMesesCompletosTerminarAnyo(13,2021));
        //System.out.println("Dias de meses completos desde inicio del año "+diasMesesCompletosDesdeInicioAnyo(2,2020));
        //System.out.println("Dias entre dos años: "+diasEntreDosAnyos(2020,2019));
        //System.out.println("Dias entre dos fechas: "+numeroDiasEntreDosFechas(10,12,2020,20,12,2020));

    }

    // La función recibe dos fechas y devuelve el número de días entre las dos fechas.
    // Las fechas deben estar en orden, sino no funciona.
    public static int numeroDiasEntreDosFechas(int diaInicial, int mesInicial, int anyoInicial, int diaFinal, int mesFinal, int anyoFinal){
        int numeroTotalDias=0;

        //Distinguimos dos casos, cuando estamos en el mismo año o en distintos años.
        if (anyoInicial==anyoFinal){
            // Si las dos fechas están en el mismo año, contamos los días desde el inicio del año en ambos casos y los restamos.
            System.out.println(diasMesesCompletosDesdeInicioAnyo(mesFinal-1,anyoFinal)+" "+
                    diasDesdeInicioMes(diaFinal,mesFinal,anyoFinal)+" "+
                    diasMesesCompletosDesdeInicioAnyo(mesInicial-1,anyoInicial)+" "+
                    diasDesdeInicioMes(diaInicial,mesInicial,anyoInicial)
            );
            numeroTotalDias = diasMesesCompletosDesdeInicioAnyo(mesFinal-1,anyoFinal)+
                    diasDesdeInicioMes(diaFinal,mesFinal,anyoFinal)-
                    diasMesesCompletosDesdeInicioAnyo(mesInicial-1,anyoInicial)-
                    diasDesdeInicioMes(diaInicial,mesInicial,anyoInicial);
        }
        else {
            // Si las dos fechas están en distinto año, sumamos:
            // los días para terminar el año inicial + los dias de años intermedios + los dias del año final
            System.out.println(diasParaTerminarMes(diaInicial, mesInicial, anyoInicial)+ " "+
                    diasMesesCompletosTerminarAnyo(mesInicial+1,anyoInicial)+" "+
                    diasEntreDosAnyos(anyoInicial+1, anyoFinal-1)+" "+
                    diasMesesCompletosDesdeInicioAnyo(mesFinal-1,anyoFinal)+" "+
                    diasDesdeInicioMes(diaFinal,mesFinal,anyoFinal)
            );
            numeroTotalDias = diasParaTerminarMes(diaInicial, mesInicial, anyoInicial) +
                    diasMesesCompletosTerminarAnyo(mesInicial + 1, anyoInicial) +
                    diasEntreDosAnyos(anyoInicial + 1, anyoFinal - 1) +
                    diasMesesCompletosDesdeInicioAnyo(mesFinal - 1, anyoFinal) +
                    diasDesdeInicioMes(diaFinal, mesFinal, anyoFinal);
        }
        return numeroTotalDias;
    }

    // La función recibe una fecha y devuelve los dias que faltan para terminar el mes actual
    public static int diasParaTerminarMes(int dia, int mes, int anyo){
        int diasMesActual = numeroDiasMesAnyo(mes, anyo);
        return diasMesActual-dia;
    }

    // La función recibe una fecha y devuelve los dias transcurridos desde el inicio del mes actual
    public static int diasDesdeInicioMes(int dia, int mes, int anyo){
        return dia;
    }

    // La función recibe dos años y la suma de los días entre estos años, ambos incluidos
    public static int diasEntreDosAnyos(int anyoInicial, int anyoFinal){
        int totalDias=0;
        //Recorremos todos los años y sumamos sus días (365 o 366 en función de si el año es bisiesto).
        for (int i=anyoInicial;i<=anyoFinal;i++){
            if (esBisiesto(i)){
                totalDias=totalDias+366;
            }else{
                totalDias=totalDias+365;
            }

        }
        return totalDias;
    }


    // La función recibe un mes y año, y devuelve los dias que faltan para terminar el año, desde el mes indicado (incluido)
    public static int diasMesesCompletosTerminarAnyo(int mes, int anyo){
        int diasTotalPorMeses=0;
        //Recorremos los meses hasta el final de año y vamos acumulando sus días
        for(int i=mes; i<=12;i++){
            diasTotalPorMeses= diasTotalPorMeses+numeroDiasMesAnyo(i, anyo);
        }
        return diasTotalPorMeses;
    }

    // La función recibe una fecha y devuelve los dias transcurridos en el año actual, hasta el mes actual incluido.
    public static int diasMesesCompletosDesdeInicioAnyo(int mes, int anyo){
        int diasTotalPorMeses=0;
        //Recorremos los meses desde el inicio del año, hasta el mes actual (incluido) y vamos acumulando sus días
        for(int i=1; i<=mes;i++){
            diasTotalPorMeses= diasTotalPorMeses+numeroDiasMesAnyo(i, anyo);
        }
        return diasTotalPorMeses;
    }

    // La función recibe un año y devuelve si es bisiesto o no
    public static boolean esBisiesto(int anyo){
        if((anyo%4==0 && anyo%100!=0) || (anyo%400==0)){
            return true;
        }
        else{
            return false;
        }
    }

    // La función recibe un mes y un año, y devuelve el número de días de ese mes, en ese año
    public static int numeroDiasMesAnyo(int mes, int anyo){
        int dias=0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                if (esBisiesto(anyo)) {
                    dias = 29;
                } else dias = 28;
        }
        return dias;
    }

    // La función recibe una fecha y devuelve si es correcta o no (años desde el 0 al 3000)
    public static boolean esFechaCorrecta ( int dias, int mes, int anyo){
        boolean correcta=false;
        int diasMes = numeroDiasMesAnyo(mes, anyo);
        if (anyo>=0 && anyo <=3000){ //Si el año está entre 0 y 3000
            if (mes >=1 && mes <=12){ //Si el mes está entre 1 y 12
                if (dias>=1 && dias<=diasMes){ // Si el día está entre 1 y el número de días de ese mes
                    // Si se cumplen las tres condiciones, la fecha es correcta
                    correcta=true;
                }
            }
        }
        return correcta;
    }




}
