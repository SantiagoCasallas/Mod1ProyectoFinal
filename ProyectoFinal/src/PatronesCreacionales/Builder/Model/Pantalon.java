package PatronesCreacionales.Builder.Model;

public class Pantalon {
    private String color, marca, talla, material;

    public Pantalon(String color, String marca, String talla, String material) {
        this.color = color;
        this.marca = marca;
        this.talla = talla;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    @Override
    public String toString() {
        return "{" +
                " color='" + getColor() + "'" +
                ", marca='" + getMarca() + "'" +
                ", talla='" + getTalla() + "'" +
                "}";
    }

}
