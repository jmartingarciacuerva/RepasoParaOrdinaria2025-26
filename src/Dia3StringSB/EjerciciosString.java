package Dia3StringSB;

import java.util.Arrays;

public class EjerciciosString {
    public static void main(String[] args) {
        String palabra = new String("ZHola");
        String palabra2 = "Hola";


        System.out.println(palabra.indexOf("lai"));
        System.out.println(palabra.compareTo(palabra2));

        String frase = "AAAAAAAAAAAABBBBBBBBBBBAAAAACCCCCCCCCCCC";
       // String frase2= frase.replace("A","Z");
        frase= frase.replaceFirst("A","Z");
        System.out.println(frase);

        String fraseCortada = frase.substring(12,20);
        System.out.println(fraseCortada);

        String nombre="AAA BBBB CCCCC DDDDD";
        String[] cachitos=nombre.split(" ");

        System.out.println(Arrays.toString(cachitos));







    }
}
