package Dia2Funciones;

public class Ej5Funciones {

    /*
    Escribe una función que reciba un número de segundos. La función mostrará por pantalla
cuantos días, horas, minutos y segundos máximos se pueden conseguir con los segundos
iniciales.
Nota: Segundos iniciales 90090 => 1 día, 1 hora, 1 minuto y 30 segundos
     */


    public static void main(String[] args) {
        ejercicio5(90090);
      /*  int segundos = 30000;
        ejercicio5(segundos);
*/
    }



//Funcion que realiza todas las operaciones y muestra los resultados por pantalla
    public static void ejercicio5 (int segundos){

        int dias = segundos/86400;
        int segundosQueSobran = segundos%86400;

        int horas = segundosQueSobran/3600;
        segundosQueSobran=segundosQueSobran%3600;

        int minutos= segundosQueSobran/60;
        segundosQueSobran = segundosQueSobran%60;

        System.out.println("Dias: "+dias+ ", horas: "+horas+ ", minutos: "+minutos+ ", segundos: "+segundosQueSobran);
    }


}
