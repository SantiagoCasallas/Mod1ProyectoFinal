package PatronesCreacionales.Builder.Model;

public class Donacion implements BuilderDonacion {

    private DonacionRopa donacionRopa = new DonacionRopa();

    @Override
    public void setZapatos(String modelo, String marca, String talla, String material) {
        donacionRopa.setZapatos(new Zapatos(modelo, marca, talla, material));
    }

    @Override
    public void setChaqueta(String color, String marca, String talla) {
        // TODO Auto-generated method stub
        donacionRopa.setChaqueta(new Chaqueta(color, marca, talla));
    }

    @Override
    public void setCamiseta(String modelo, String marca, String talla) {
        // TODO Auto-generated method stub
        donacionRopa.setCamiseta(new Camiseta(modelo, marca, talla));
    }

    @Override
    public void setPantalon(String color, String marca, String talla, String material) {
        // TODO Auto-generated method stub
        donacionRopa.setPantalon(new Pantalon(color, marca, talla, material));
    }

    @Override
    public DonacionRopa getDonacionRopa() {
        return donacionRopa;
    }

}
