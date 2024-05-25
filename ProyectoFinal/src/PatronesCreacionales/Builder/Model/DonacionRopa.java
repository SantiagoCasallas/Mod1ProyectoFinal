package PatronesCreacionales.Builder.Model;

public class DonacionRopa {

    private Chaqueta chaqueta;
    private Pantalon pantalon;
    private Camiseta camiseta;
    private Zapatos zapatos;

    public DonacionRopa() {

    }

    public Chaqueta getChaqueta() {
        return this.chaqueta;
    }

    public void setChaqueta(Chaqueta chaqueta) {
        this.chaqueta = chaqueta;
    }

    public Pantalon getPantalon() {
        return this.pantalon;
    }

    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }

    public Camiseta getCamiseta() {
        return this.camiseta;
    }

    public void setCamiseta(Camiseta camiseta) {
        this.camiseta = camiseta;
    }

    public Zapatos getZapatos() {
        return this.zapatos;
    }

    public void setZapatos(Zapatos zapatos) {
        this.zapatos = zapatos;
    }

    @Override
    public String toString() {
        return "{" +
                " chaqueta='" + getChaqueta() + "'" +
                ", pantalon='" + getPantalon() + "'" +
                ", camiseta='" + getCamiseta() + "'" +
                ", zapatos='" + getZapatos() + "'" +
                "}";
    }
}