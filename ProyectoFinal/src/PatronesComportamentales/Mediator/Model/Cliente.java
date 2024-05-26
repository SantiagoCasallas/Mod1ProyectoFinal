package PatronesComportamentales.Mediator.Model;

public class Cliente {
    private Mediador mediador;

    public Cliente(Mediador mediador) {
        this.mediador = mediador;
    }

    public String consultarEnvio() {
        if (mediador.haLlegado()) {
            mediador.setEntregado(true);
            return "El envío ya ha llegado y se encuentra en las bodegas";
        } else {
            return "El envío no ha llegado a la sede aún";

        }

    }

    public String entregado() {
        return "Donación entregada en la sede";
    }

}
