package PatronesCreacionales.Prototype.Controller;

import PatronesCreacionales.Prototype.Modelo.Kit;
import PatronesCreacionales.Prototype.Modelo.KitAlimentos;
import PatronesCreacionales.Prototype.Modelo.KitRopa;
import PatronesCreacionales.Prototype.View.Vista;

public class Test {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Kit kitAlimentos1 = new KitAlimentos("Kit alimentos 1");
        Kit kitRopa1 = new KitRopa("Kit ropa 1");

        vista.mostrar("\nEl " + kitAlimentos1.getNombre() + " original es");
        kitAlimentos1.contenidoMostrar();
        vista.mostrar("\nEl " + kitRopa1.getNombre() + " original es");
        kitRopa1.contenidoMostrar();

        Kit kitAlimentos2 = (Kit) kitAlimentos1.clone();
        vista.mostrar("\nEl " + kitAlimentos2.getNombre() + " es");
        kitAlimentos2.contenidoMostrar();

        Kit kitRopa2 = (Kit) kitRopa1.clone();
        vista.mostrar("\nEl " + kitRopa2.getNombre() + " es");
        kitRopa2.contenidoMostrar();
    }
}
