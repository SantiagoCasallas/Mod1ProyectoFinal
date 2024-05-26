package PatronesComportamentales.Mediator.Model;

public class Central {
    Mediador mediador;

    public Central(Mediador mediador) {
        this.mediador = mediador;
        mediador.setEntregado(false);
    }

    public String notificarCliente() {
        mediador.setEntregado(true);
        return "El sistema dice:\tLa donación ya ha llegado";
    }

}
