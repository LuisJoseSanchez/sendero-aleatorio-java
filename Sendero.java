
import java.util.Scanner;

public class Sendero {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca longitud del sendero en metros: ");
    int longitud = Integer.parseInt(s.nextLine());
    
    int margen = 14;
    
    for (int i = 0; i < longitud; i++) {
      margen += aleatorio(-1, 1);
      System.out.print(repite(" ", margen));
      
      if (aleatorio(0, 1) == 0) {
        System.out.println("#    #");
      } else { // Hay obstáculo
        int posicionObstaculo = aleatorio(1, 4);
        System.out.print("#");
        for (int j = 1; j <= 4; j++) {
          if (j == posicionObstaculo) {
            if (aleatorio(0, 1) == 0) {
              System.out.print("*");
            } else {
              System.out.print("O");
            }
            
          } else {
            System.out.print(" ");
          }
        }
        System.out.println("#");
      }
      
    }
  }
  
  
  public static int aleatorio(int inicio, int fin) {
    return (int)(Math.random() * (fin - inicio + 1)) + inicio;
  }
  
  public static String repite(String cadena, int repeticiones) {
    String resultado = "";
    
    for (int i = 0; i < repeticiones; i++) {
      resultado += cadena;
    }
    
    return resultado;
  }
}
