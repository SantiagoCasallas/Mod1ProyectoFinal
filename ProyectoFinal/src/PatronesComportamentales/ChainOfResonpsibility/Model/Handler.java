package PatronesComportamentales.ChainOfResonpsibility.Model;

import Interfaz.Interfaz;

public interface Handler {
    Interfaz vista = new Interfaz();

    void setNextHandler(Handler handler);

    void handleRequest(Donacion donacion);
}
