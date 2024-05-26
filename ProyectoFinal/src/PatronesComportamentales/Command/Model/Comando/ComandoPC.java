package PatronesComportamentales.Command.Model.Comando;

import PatronesComportamentales.Command.Model.Donaciones.Computador;

public class ComandoPC implements Comando {
    private Computador computador;

    public ComandoPC(Computador computador) {
        this.computador = computador;
    }

    @Override
    public String ejecutar() {
        return computador.regristrar();
    }

}
