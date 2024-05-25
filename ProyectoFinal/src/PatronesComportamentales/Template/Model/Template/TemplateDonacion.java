package PatronesComportamentales.Template.Model.Template;

public abstract class TemplateDonacion {

    protected String nombreDonante;
    protected String tipoDonacion;
    protected String descripcion;

    public TemplateDonacion(String nombreDonante, String tipoDonacion, String descripcion) {
        this.nombreDonante = nombreDonante;
        this.tipoDonacion = tipoDonacion;
        this.descripcion = descripcion;
    }

    public final String realizarDonacion() {
        if (validarDatos()) {
            return registrarDonacion() + "\n" +
                    enviarNotificacion();
        } else
            return "Donación no válida";
    }

    protected abstract boolean validarDatos();

    protected abstract String registrarDonacion();

    protected abstract String enviarNotificacion();

}
