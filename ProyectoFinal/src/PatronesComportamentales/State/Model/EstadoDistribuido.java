package PatronesComportamentales.State.Model;

public class EstadoDistribuido implements EstadoDonacion {
    @Override
    public void recibir(Donacion donacion) {
        System.out.println("La donación ya ha sido distribuida. E4");
        donacion.setTipo("distribuir");
    }

    @Override
    public void clasificar(Donacion donacion) {
        System.out.println("La donación ya ha sido distribuida. E4");
        donacion.setTipo("distribuir1");
    }

    @Override
    public void almacenar(Donacion donacion) {
        System.out.println("La donación ya ha sido distribuida.E4");
        donacion.setTipo("distribuir2");
    }

    @Override
    public void distribuir(Donacion donacion) {
        System.out.println("La donación ya ha sido distribuida. E4");
        donacion.setTipo("distribuir3");
    }

    @Override
    public String getEstado() {
        return "Estado Distribuido";
    }
}