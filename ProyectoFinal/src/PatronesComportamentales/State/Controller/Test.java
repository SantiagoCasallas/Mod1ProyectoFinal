package PatronesComportamentales.State.Controller;

import PatronesComportamentales.State.Model.Donacion;

public class Test {
    public static void main(String[] args) {
        Donacion donacion = new Donacion("Ropa", "Caja de camisetas");

        // Recibir la donación
        donacion.recibir();
        System.out.println(donacion.getTipo());
        System.out.println(donacion.getEstado());

        // Clasificar la donación
        donacion.clasificar();
        System.out.println(donacion.getTipo());
        System.out.println(donacion.getEstado());
        // Almacenar la donación
        donacion.almacenar();
        System.out.println(donacion.getTipo());
        System.out.println(donacion.getEstado());
        // Distribuir la donación
        donacion.distribuir();
        System.out.println(donacion.getTipo());
        System.out.println(donacion.getEstado());

    }
}