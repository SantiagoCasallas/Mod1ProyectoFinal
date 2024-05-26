package PatronesComportamentales.Command.Model.Donaciones;

public class Libros extends Donacion {
    private boolean esPastaDura;
    private String cobertura;

    public Libros(String nombre, String descripcion, int cantidad, String condicion, boolean esPastaDura) {
        super(nombre, descripcion, cantidad, condicion);
        this.esPastaDura = esPastaDura;
        if (esPastaDura) {
            this.cobertura = "Pasta dura";
        } else {
            this.cobertura = "Tapa blanda";
        }
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
            return "La donación no es válida";
        } else {
            return "La donación ha sido verificada, se almacenará en la biblioteca\n" + almacenar();
        }
    }

    @Override
    public String almacenar() {
        return "Se ha almacenado en la biblioteca";
    }

    public String getCobertura() {
        return cobertura;
    }

    public String toString() {
        return super.toString() + ", cobertura= '" + getCobertura() + "'" +
                "}";
    }
}
