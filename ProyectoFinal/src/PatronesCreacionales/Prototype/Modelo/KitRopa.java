package PatronesCreacionales.Prototype.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KitRopa extends Kit {

    Elemento item1 = new Elemento("Camisetas", "5");
    Elemento item2 = new Elemento("Pantalones", "2");
    Elemento item3 = new Elemento("Chaqueta", "1");
    Elemento item4 = new Elemento("Medias", "5");
    Elemento item5 = new Elemento("Interiores", "5");

    public ArrayList<Elemento> kitAlimentos = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5));

    public KitRopa(String nombre) {
        super(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void contenidoMostrar() {
        for (Elemento elemento : kitAlimentos) {
            vista.mostrar(elemento.getNombre() + ": " + elemento.getCantidad());
        }
    }

    @Override
    public Kit clone() {

        KitAlimentos kit = new KitAlimentos("kitClonado");
        return kit;

    }

}
