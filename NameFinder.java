import java.util.ArrayList;
import java.util.Scanner;

public class NameFinder {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> students = new ArrayList<>();
    int option = 0;

    students.add("Ramses");
    students.add("Maria");
    students.add("Juan");
    students.add("Ana");
    students.add("Carlos");
    students.add("Luisa");

    while (option != 2) {
      System.out.println("escribe 1 para buscar al estudiante");
      System.out.println("escribe 2 para salir");
      option = keyboard.nextInt();
      keyboard.nextLine();

      switch (option) {
        case 1:
          System.out.println("\nEscribe el nombre del estudiante a buscar");
          String nameTosearch = keyboard.nextLine();
          System.out.println("buscando al estudaiante...");

          if (students.contains(nameTosearch)) {
            System.out.println("student found");
          } else {
            System.out.println("student not found");
          }
          break;

        case 2:
          System.out.println("Estamos saliendo... Adios!");
          break;
      }

    }
    keyboard.close();
  }
}
