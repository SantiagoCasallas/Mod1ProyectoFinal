package PatronesEstructurales.Composite.Model;

public class Donacion {
    String name;
    double peso;

    public Donacion(String name, double peso) {
        this.name = name;
        this.peso = peso;
    }

    public String getNombre() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
