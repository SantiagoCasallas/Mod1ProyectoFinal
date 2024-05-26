package PatronesComportamentales.Mediator.Model;

public class Mediador {
    private Cliente cliente;
    private Central sistema;
    public boolean entregado;

    public void addCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addSistema(Central sistema) {
        this.sistema = sistema;
    }

    // public String notificarCliente() {
    // }

    // public String notificarSistema() {
    // }

    public boolean haLlegado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
