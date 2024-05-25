package PatronesCreacionales.Builder.Model;

public class Zapatos {

    private String modelo, marca, talla;

    public Zapatos(String modelo, String marca, String talla) {
        this.modelo = modelo;
        this.marca = marca;
        this.talla = talla;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
