package PatronesComportamentales.Strategy.Model;

public class Contexto {
    private Estrategia estrategia;

    public Contexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public String ejecutarEstrategia() {
        return estrategia.ejecutar();
    }
}
