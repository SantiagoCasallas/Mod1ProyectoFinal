package PatronesComportamentales.State.Model;

public class EstadoAlmacenado implements EstadoDonacion {

    @Override
    public void recibir(Donacion donacion) {
        System.out.println("La donación ya ha sido recibida. E3");
        donacion.setTipo("almacenar");
    }

    @Override
    public void clasificar(Donacion donacion) {
        System.out.println("La donación ya ha sido clasificada. E3");
        donacion.setTipo("almacenar1");

    }

    @Override
    public void almacenar(Donacion donacion) {
        System.out.println("La donación ya ha sido almacenada. E3");
        donacion.setTipo("almacenar2");
    }

    @Override
    public void distribuir(Donacion donacion) {
        System.out.println("Distribuyendo la donación. E3");
        donacion.setEstado(new EstadoDistribuido());
        donacion.setTipo("almacenar3");
    }

    @Override
    public String getEstado() {
        return "Estado Almacenado";
    }
}