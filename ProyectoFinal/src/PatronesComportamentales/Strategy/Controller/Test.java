package PatronesComportamentales.Strategy.Controller;

import PatronesComportamentales.Strategy.Model.Contexto;
import PatronesComportamentales.Strategy.Model.Estrategia;
import PatronesComportamentales.Strategy.Model.ZonaConflicto;
import PatronesComportamentales.Strategy.Model.ZonaSegura;
import View.Interfaz;

public class Test {
    public static void main(String[] args) {
        Interfaz vista = new Interfaz();
        Estrategia estrategia = new ZonaConflicto();
        Estrategia estrategia2 = new ZonaSegura();
        Contexto contexto = new Contexto(estrategia);
        vista.mostrar("----Estrategia: Zona de conflicto----");
        vista.mostrar(contexto.ejecutarEstrategia());
        vista.mostrar("----Cambiando estrategia: Zona segura----");
        contexto.setEstrategia(estrategia2);
        vista.mostrar(contexto.ejecutarEstrategia());
    }
}
