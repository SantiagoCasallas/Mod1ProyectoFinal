package PatronesComportamentales.ChainOfResonpsibility.Controller;

import PatronesComportamentales.ChainOfResonpsibility.Model.*;

public class Test {
    public static void main(String[] args) {
        Handler ropaHandler = new RopaHandler();
        Handler alimentosHandler = new AlimentosHandler();
        Handler otrosHandler = new OtrosHandler();

        ropaHandler.setNextHandler(alimentosHandler);
        alimentosHandler.setNextHandler(otrosHandler);

        Donacion donacion1 = new DonacionRopa("Camiseta color verde");
        Donacion donacion2 = new DonacionAlimentos("5 Latas de  atun");
        Donacion donacion3 = new DonacionOtros("Bicicleta");

        ropaHandler.handleRequest(donacion1);
        ropaHandler.handleRequest(donacion2);
        ropaHandler.handleRequest(donacion3);
    }

}
