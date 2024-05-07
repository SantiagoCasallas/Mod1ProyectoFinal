package PatronesCreacionales.Prototype.Modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KitAlimentos extends Kit {

    Elemento item1 = new Elemento("Latas de atun", "5");
    Elemento item2 = new Elemento("Latas de frijoles", "2");
    Elemento item3 = new Elemento("Latas de maiz", "2");
    Elemento item4 = new Elemento("Latas de salmón", "2");
    Elemento item5 = new Elemento("Sopa", "5");

    public ArrayList<Elemento> kitAlimentos = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5));

    public KitAlimentos(String nombre) {
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
