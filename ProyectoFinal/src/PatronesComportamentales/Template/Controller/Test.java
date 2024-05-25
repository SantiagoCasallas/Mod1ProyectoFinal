package PatronesComportamentales.Template.Controller;

import PatronesComportamentales.Template.Model.Template.DonacionTiempo;
import PatronesComportamentales.Template.Model.Template.TemplateDonacion;

public class Test {
    public static void main(String[] args) {
        TemplateDonacion template = new DonacionTiempo("John Carmack", "Clases", "Clases de programación", 100);
        System.out.println(template.realizarDonacion());
    }
}
