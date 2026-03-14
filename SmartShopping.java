import java.util.ArrayList;
import java.util.Scanner;

public class SmartShopping {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> shoppinglist = new ArrayList<String>();

    shoppinglist.add("leche");
    shoppinglist.add("queso");
    shoppinglist.add("huevos");
    shoppinglist.add("carne");
    shoppinglist.add("jamon");
    shoppinglist.add("arroz");

    int item = 0;
    System.out.println("\n----------------------------------");
    System.out.print("BIENVENIDO A TU LISTA DE COMPRAS");
    System.out.println("\n----------------------------------");

    while (item != 5) {
      System.out.println("Que haras con la lista de compras? (escribe 5 para regresar al menu principal)");
      // item = keyboard.nextInt();

      System.out.println("Escribe 1 para agregar un articulo a la lista");
      System.out.println("Escribe 2 para eliminar un articulo de la lista");
      System.out.println("Escribe 3 para mostrar un articulo de la lista");
      System.out.println("Escribe 4 para buscar un articulo en la lista");
      System.out.println("Escribe 5 para regresar para salir");
      item = keyboard.nextInt();
      keyboard.nextLine();

      switch (item) {
        case 1: {
          System.out.println("Que articulo agregaras a la lista");
          String articule = keyboard.nextLine();
          shoppinglist.add(articule);
        }
          break;
        case 2: {
          System.out.println("Que articulo eliminaras de la lista");
          String articule = keyboard.nextLine();
          shoppinglist.remove(articule);
        }
          break;
        case 3: {
          System.out.println("mostrando la lista de compras");
          for (int i = 0; i < shoppinglist.size(); i++) {
            System.out.println(shoppinglist.get(i));
          }
        }
          break;

        case 4: {
          System.out.println("que articulo busca de la lista");
          String articule = keyboard.nextLine();
          if (shoppinglist.contains(articule)) {
            System.out.println("El articulo se encuentra en la lista");
          } else {
            System.out.println("El articulo no se encuentra en la lista");
          }
        }
          break;
        case 5: {
          System.out.println("\n----------------------------------");
          System.out.print("\nnos vemos pronto");
          System.out.println("\n----------------------------------");
        }
      }
    }
    keyboard.close();
  }

}