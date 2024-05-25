package PatronesComportamentales.Strategy.Model;

public class ZonaSegura implements Estrategia {

    @Override
    public String ejecutar() {
        // TODO Auto-generated method stub
        return (cargarSuministros() + "\n" + transportarSuministros() + "\n" + repartirSuministros());
    }

    public String cargarSuministros() {
        return "Cargando suministros";
    }

    public String transportarSuministros() {
        return "Transportando suministros";
    }

    public String repartirSuministros() {
        return "Repartiendo suministros";
    }

}
