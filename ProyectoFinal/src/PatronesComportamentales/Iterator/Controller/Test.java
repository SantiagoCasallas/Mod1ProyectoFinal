package PatronesComportamentales.Iterator.Controller;

import PatronesComportamentales.Iterator.Model.Donacion;
import PatronesComportamentales.Iterator.Model.Iterador;
import PatronesComportamentales.Iterator.Model.ListadoDonaciones;
import View.Interfaz;

public class Test {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        ListadoDonaciones listaDonaciones = new ListadoDonaciones(2);
        Donacion donacion1 = new Donacion("Libros", "Colección de libros del señor de los anillos");
        Donacion donacion2 = new Donacion("Alimentos", "Un continer con víveres");
        Iterador iterador = listaDonaciones.iterator();
        listaDonaciones.add(donacion1);
        listaDonaciones.add(donacion2);

        while (iterador.hasNext()) {
            Donacion donacion = iterador.next();
            vista.mostrar("Donacion:\t" + donacion.getNombre() + "\nDescripción:\t" + donacion.getDescripcion());
            vista.mostrar("---------------------------------");
        }

    }
}
