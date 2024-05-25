package PatronesCreacionales.Builder.Model;

public class Donacion implements BuilderDonacion {
    private String color, marca, talla, modelo;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public DonacionRopa getDonacionRopa() {

        return new DonacionRopa(color, marca, talla);
    }
}
