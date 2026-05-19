package Dia6TryCatchClases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aparcamiento {

    private String matricula;
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;
    private Double importe;
    private static Double precioMinuto;
     static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


    public Aparcamiento(String matricula, LocalDateTime fechaHoraEntrada) {
        this.matricula = matricula;
        if (fechaHoraEntrada.isAfter(LocalDateTime.now())) {
            throw new FechaAparcamientoInvalidaException("Estas aparcando en un dia del futuro. No se puede");
        } else {
            this.fechaHoraEntrada = fechaHoraEntrada;
        }
        this.fechaHoraSalida = null;
        this.importe = null;
    }

    @Override
    public String toString() {
        if (fechaHoraSalida == null) {
            return "Matricula='" + matricula + "'" +
                    ", fechaHoraEntrada=" + fechaHoraEntrada.format(FORMATO) +
                    " El coche todavía está en el parking";
        } else {
            return "Matricula='" + matricula + '\'' +
                    ", fechaHoraEntrada=" + fechaHoraEntrada.format(FORMATO) +
                    ", fechaHoraSalida=" + fechaHoraSalida.format(FORMATO) +
                    ", importe=" + importe;
        }
    }
}
