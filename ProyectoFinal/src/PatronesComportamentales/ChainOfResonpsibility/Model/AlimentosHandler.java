package PatronesComportamentales.ChainOfResonpsibility.Model;

import Interfaz.Interfaz;

public class AlimentosHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(Donacion donacion) {
        if (donacion.getTipo().equalsIgnoreCase("Alimentos")) {
            vista.mostrar("Procesando donación de alimentos: " + donacion.getDescripcion());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(donacion);
        }
    }
}