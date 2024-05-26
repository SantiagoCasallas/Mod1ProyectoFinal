package PatronesComportamentales.Command.Model.Donaciones;

public class Computador extends Donacion {
    private int generacion;

    public Computador(String nombre, String descripcion, int cantidad, String condicion, int generacion) {
        super(nombre, descripcion, cantidad, condicion);
        this.generacion = generacion;
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
        if (!valido || generacion < 8) {
            return "La donación no es válida";
        } else {
            return "La donación ha sido verificada, se almacenará en la bodega de tecnología\n" + almacenar();
        }
    }

    @Override
    public String almacenar() {
        return "Almacenando en la sección de la bodega de tecnología";
    }

}
