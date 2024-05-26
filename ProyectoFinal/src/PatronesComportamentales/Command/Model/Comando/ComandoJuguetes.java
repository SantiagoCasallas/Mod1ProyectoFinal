package PatronesComportamentales.Command.Model.Comando;

import PatronesComportamentales.Command.Model.Donaciones.Juguetes;

public class ComandoJuguetes implements Comando {
    private Juguetes juguetes;

    public ComandoJuguetes(Juguetes juguetes) {
        this.juguetes = juguetes;
    }

    @Override
    public String ejecutar() {
        return juguetes.regristrar();
    }

}
