package PatronesCreacionales.Builder.Model;

public interface BuilderDonacion {
    public void setZapatos(String modelo, String marca, String talla, String material);

    public void setChaqueta(String color, String marca, String talla);

    public void setCamiseta(String modelo, String marca, String talla);

    public void setPantalon(String color, String marca, String talla, String material);

    public DonacionRopa getDonacionRopa();
}
