package PatronesCreacionales.Builder.Controller;

import Interfaz.Interfaz;
import PatronesCreacionales.Builder.Model.Director;
import PatronesCreacionales.Builder.Model.Donacion;
import PatronesCreacionales.Builder.Model.DonacionRopa;
import PatronesCreacionales.Builder.Model.TipoDonacion;

public class Test {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        Director director = new Director();
        Donacion builder = new Donacion();
        director.DonacionCamiseta(builder);
        DonacionRopa donacion = builder.getDonacionRopa();

        comprobarParaEscribir(donacion, vista);
        donacion.setCantidad(1);
        comprobarParaEscribir(donacion, vista);

    }

    public static void comprobarParaEscribir(DonacionRopa donacion, Interfaz vista) {

        if (donacion.getCantidad() > 1)
            vista.mostrar("Se construyeron " + donacion.getCantidad() + " " + donacion.getTipo());
        else
            vista.mostrar("Se construyo " + donacion.getCantidad() + " " + donacion.getTipo());

        vista.mostrar("y su descripcion es: " + donacion.getDescripcion());
    }

}
