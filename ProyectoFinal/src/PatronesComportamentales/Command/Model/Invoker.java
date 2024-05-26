package PatronesComportamentales.Command.Model;

import PatronesComportamentales.Command.Model.Comando.Comando;

public class Invoker {
    Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public String ejecutarComando() {
        return comando.ejecutar();
    }
}
