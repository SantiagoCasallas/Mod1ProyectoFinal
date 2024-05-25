package PatronesComportamentales.Strategy.Model;

public class ZonaConflicto implements Estrategia {

    @Override
    public String ejecutar() {
        return (cargarSuministros() + "\n" + cargarVehiculos() + "\n" + cargarConvoy() + "\n" + asegurarZona() + "\n"
                + transportarSuministros() + "\n" + repartirSuministros());
    }

    public String cargarSuministros() {
        return "Cargando suministros";
    }

    public String cargarVehiculos() {
        return "Cargando vehiculos";
    }

    public String cargarConvoy() {
        return "Convoy preparado";
    }

    public String asegurarZona() {
        return "Zona asegurada";
    }

    public String transportarSuministros() {
        return "Suministros transportados";
    }

    public String repartirSuministros() {
        return "Repartiendo suministros";
    }

}
