package PatronesComportamentales.Observer.Model;

import java.time.LocalDateTime;

public class Donacion {
    private String Descripcion;
    LocalDateTime FechaCreación = LocalDateTime.now();
    LocalDateTime Fecha;

    public Donacion(String descripcion, LocalDateTime fecha) {
        this.Descripcion = descripcion;
        this.Fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public LocalDateTime getFechaCreación() {
        return FechaCreación;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
        actualizarFecha(LocalDateTime.now());
    }

    public void actualizarFecha(LocalDateTime fecha) {
        this.Fecha = fecha;
    }
}
