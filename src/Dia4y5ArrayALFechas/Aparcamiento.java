package Dia4y5ArrayALFechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aparcamiento {

    private String matricula;
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;
    private Double importe;
    private static Double precioMinuto;


    public Aparcamiento(String matricula, LocalDateTime fechaHoraEntrada) {
        this.matricula = matricula;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraSalida=null;
        this.importe=null;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        if(fechaHoraSalida == null){
        return "Matricula='" + matricula + '\'' +
                ", fechaHoraEntrada=" + fechaHoraEntrada.format(formato) +
                " El coche todavía está en el parking";}
        else{
            return "Matricula='" + matricula + '\'' +
                    ", fechaHoraEntrada=" + fechaHoraEntrada.format(formato) +
                    ", fechaHoraSalida=" + fechaHoraSalida.format(formato) +
                    ", importe=" + importe;}
    }
}
