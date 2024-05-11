package PatronesEstructurales.Proxy.View;

import java.util.Scanner;

public class Vista {

  public void mostrar(String mensaje) {
    System.out.println(mensaje);
  }

  public String capturar() {
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    String texto = scanner.next();
    return texto;
  }
}
