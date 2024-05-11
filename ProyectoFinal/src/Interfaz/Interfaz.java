package Interfaz;

import java.util.Scanner;

public class Interfaz {

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
