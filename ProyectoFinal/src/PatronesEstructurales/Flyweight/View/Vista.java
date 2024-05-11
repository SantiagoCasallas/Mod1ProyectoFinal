package PatronesEstructurales.Flyweight.View;

import java.util.Scanner;

public class Vista {

  public void mostrar(String mensaje) {
    System.out.println(mensaje);
  }

  @SuppressWarnings("resource")
  public String capturar() {
    Scanner scanner = new Scanner(System.in);
    String texto = scanner.next();
    return texto;
  }
}
