import java.util.ArrayList;
import java.util.Scanner;

public class GameInventory {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> inventory = new ArrayList<>();
    int option = 0;

    inventory.add("potion");
    inventory.add("sword");
    inventory.add("armor");
    inventory.add("shield");

    while (option != 5) {
      System.out.println("--------------- inventario ---------------");
      System.out.println("\n1. mostrar los objetos del inventario");
      System.out.println("2. Eliminar un objeto del inventario (escribe el nombre del objeto)");
      System.out.println("3. Buscar un objeto del inventario (escribe el nombre del objeto)");
      System.out.println("4. Agregar objeto al inventario");
      System.out.println("5. salir");
      System.out.println("\n-----------------------------------------");
      option = keyboard.nextInt();
      keyboard.nextLine();

      switch (option) {
        case 1:
          showInventory(inventory);
          break;
        case 2:
          System.out.println("Que objeto eliminaras del inventario?");
          String remove = keyboard.nextLine();
          if (inventory.contains(remove)) {
            System.out.println("objeto eliminado");
          } else {
            System.out.println("Objeto no se encontro");
          }
          break;
        case 3:
          System.out.println("Que objeto deseas buscar");
          String search = keyboard.nextLine();
          if (inventory.contains(search)) {
            System.out.println("Sip!" + search + "Objeto encontrado");
          } else {
            System.out.println("No tienes ese objeto");
          }
          break;
        case 4:
          System.out.println("Que objetos agregaras");
          String newItem = keyboard.nextLine();
          inventory.add(newItem);
          System.out.println("Objeto Agrgado");
          break;
        case 5:
          System.out.println("Saliendo del inventario...  Suerte!");
          break;
        default:
          System.out.println("Opcion invalida.");
      }
    }
    keyboard.close();
  }

  public static void showInventory(ArrayList<String> list) {
    System.out.println("\n--- Contenido del inventario ---");
    if (list.isEmpty()) {
      System.out.println("Inventario vacio");
    } else {
      int i = 1;
      for (String item : list) {
        System.out.println(i + "." + item);
        i++;
      }
    }
  }
}