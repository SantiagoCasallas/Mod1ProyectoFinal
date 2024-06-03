package PatronesComportamentales.ChainOfResonpsibility.Model;

public class RopaHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Donacion donacion) {
        if (donacion.getTipo().equalsIgnoreCase("Ropa")) {
            vista.mostrar("Procesando donación de ropa: " + donacion.getDescripcion());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(donacion);
        }
    }
}