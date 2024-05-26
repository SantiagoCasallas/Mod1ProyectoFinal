package PatronesComportamentales.Command.Model.Donaciones;

public class Juguetes extends Donacion {

    private String condicion;

    public Juguetes(String nombre, String descripcion, int cantidad, String condicion) {

        super(nombre, descripcion, cantidad, condicion);

    }

    @Override
    public String regristrar() {
        if (cantidad < 0) {
            return "No se admiten registros sin elementos";
        } else {
            return "Donación registrada:\t " + toString() + "\n, pasa a verificación\n" + verificar();
        }
    }

    @Override
    public String verificar() {
        if (cantidad < 0 || !valido) {
            return "Donación no válida, no se almacenará en la bodega";
        } else {
            return "Donación válida, se almacenará en la bodega\n" + almacenar();
        }
    }

    @Override
    public String almacenar() {
        return "Almacenando en bodega de juguetes";
    }

    public String getCondicion() {
        return condicion;
    }

}
