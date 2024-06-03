package PatronesComportamentales.State.Model;

public interface EstadoDonacion {

    public void recibir(Donacion donacion);

    public void clasificar(Donacion donacion);

    public void almacenar(Donacion donacion);

    public void distribuir(Donacion donacion);

    public String getEstado();
}
