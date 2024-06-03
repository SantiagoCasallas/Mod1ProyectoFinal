package PatronesComportamentales.State.Model;

public class EstadoClasificado implements EstadoDonacion {
    @Override
    public void recibir(Donacion donacion) {
        System.out.println("La donación ya ha sido recibida. E2");
        donacion.setTipo("clasificar");
    }

    @Override
    public void clasificar(Donacion donacion) {
        System.out.println("La donación ya ha sido clasificada. E2");
        donacion.setTipo("clasificar1");
    }

    @Override
    public void almacenar(Donacion donacion) {
        System.out.println("Almacenando la donación. E2");
        donacion.setEstado(new EstadoAlmacenado());
        donacion.setTipo("clasificar2");
    }

    @Override
    public void distribuir(Donacion donacion) {
        System.out.println("La donación debe ser almacenada antes de distribuirla. E2");
        donacion.setTipo("clasificar3");
    }

    @Override
    public String getEstado() {
        return "Estado Clasificado";
    }
}
