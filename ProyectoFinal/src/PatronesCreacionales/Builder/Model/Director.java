package PatronesCreacionales.Builder.Model;

import java.lang.module.ModuleDescriptor.Builder;

public class Director {
    public void DonacionCamiseta(BuilderDonacion builder) {
        builder.setTipo(TipoDonacion.Camiseta);

        builder.setColor("Rojo");
        builder.setCantidad(5);
        builder.setDescripcion("camiseta muy bonita");
    }

    public void DonacionPantalon(BuilderDonacion builder) {
        builder.setTipo(TipoDonacion.Pantalon);

        builder.setDescripcion("Pantalon de mesclilla");
        builder.setColor("Azul jean");
        builder.setCantidad(5);
    }

}
