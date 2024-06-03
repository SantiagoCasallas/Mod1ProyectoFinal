package PatronesComportamentales.State.Model;

public class EstadoRecibido implements EstadoDonacion {
    @Override
    public void recibir(Donacion donacion) {
        System.out.println("La donación ya ha sido recibida. E1");
        donacion.setTipo("recibir");
    }

    @Override
    public void clasificar(Donacion donacion) {
        System.out.println("Clasificando la donación. E1");
        donacion.setTipo("recibir1");

        donacion.setEstado(new EstadoClasificado());
    }

    @Override
    public void almacenar(Donacion donacion) {
        System.out.println("La donación debe ser clasificada antes de almacenarla. E1");
        donacion.setTipo("recibir2");

    }

    @Override
    public void distribuir(Donacion donacion) {
        System.out.println("La donación debe ser almacenada antes de distribuirla. E1");
        donacion.setTipo("recibir3");

    }

    public String getEstado() {
        return "Estado Recibido";
    }

}
