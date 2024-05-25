package PatronesCreacionales.Builder.Model;

public class Camiseta {
    private String color, marca, talla;

    public Camiseta(String color, String marca, String talla) {
        this.color = color;
        this.marca = marca;
        this.talla = talla;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

}
