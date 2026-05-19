package Dia6TryCatchClases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Aparcamiento {

    private String matricula;
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;
    private Double importe;
    private static Double precioMinuto=0.05;
     static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


    public Aparcamiento(String matricula, LocalDateTime fechaHoraEntrada) {
        this.matricula = matricula;
        //Si la fecha de entrada es posterior a la de hoy, lanza un error
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

    public void saleCoche(LocalDateTime fechaHoraSalida){
        this.fechaHoraSalida=fechaHoraSalida;
        setImporte();//Calcula el importe, ahora que tenemos la fechahora de salida
    }

    private void setImporte() {
        int minutosAparcado=(int)(fechaHoraEntrada.until(fechaHoraSalida, ChronoUnit.MINUTES));
        this.importe= minutosAparcado*precioMinuto;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aparcamiento that = (Aparcamiento) o;
        return Objects.equals(matricula, that.matricula) && Objects.equals(fechaHoraEntrada, that.fechaHoraEntrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, fechaHoraEntrada);
    }
}
