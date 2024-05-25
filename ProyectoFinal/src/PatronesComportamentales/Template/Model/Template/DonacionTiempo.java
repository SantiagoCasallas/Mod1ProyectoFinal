package PatronesComportamentales.Template.Model.Template;

public class DonacionTiempo extends TemplateDonacion {
    private int horasDonadas;

    public DonacionTiempo(String nombreDonante, String tipoDonacion, String descripcion, int horasDonadas) {
        super(nombreDonante, tipoDonacion, descripcion);
        this.horasDonadas = horasDonadas;
    }

    @Override
    protected boolean validarDatos() {
        if (horasDonadas <= 0) {
            return false;
        } else
            return true;
    }

    @Override
    protected String registrarDonacion() {
        return nombreDonante + " va a realizar " + horasDonadas + " horas de trabajo Ad honorem";
    }

    @Override
    protected String enviarNotificacion() {
        return "¡Muchas gracias por su tiempo!";
    }

}
