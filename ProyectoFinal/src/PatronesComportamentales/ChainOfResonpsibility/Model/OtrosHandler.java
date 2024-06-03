package PatronesComportamentales.ChainOfResonpsibility.Model;

public class OtrosHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Donacion donacion) {
        if (donacion.getTipo().equalsIgnoreCase("Otros")) {
            vista.mostrar("Procesando donación de otros tipos: " + donacion.getDescripcion());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(donacion);
        }
    }
}