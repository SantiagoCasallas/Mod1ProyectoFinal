package PatronesComportamentales.Mediator.Controller;

import Interfaz.Interfaz;
import PatronesComportamentales.Mediator.Model.Central;
import PatronesComportamentales.Mediator.Model.Cliente;
import PatronesComportamentales.Mediator.Model.Mediador;

public class Test {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        Mediador mediador = new Mediador();
        Cliente cliente = new Cliente(mediador);
        Central central = new Central(mediador);
        vista.mostrar(cliente.consultarEnvio());
        vista.mostrar(central.notificarCliente());
        vista.mostrar(cliente.consultarEnvio());
    }
}
