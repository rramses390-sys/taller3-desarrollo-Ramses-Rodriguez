import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<String> tasks = new ArrayList<>();

    System.out.println("Bienvenido al gestor de tareas!");
    int option = 0;

    while (option != 5) {
      System.out.println("/n--- menu de opciones ---");
      System.out.println("1. Agregar tarea");
      System.out.println("2. Eliminar tarea");
      System.out.println("3. Mostrar tareas");
      System.out.println("4. Marcar tarea como completada");
      System.out.println("5. Salir");
      option = keyboard.nextInt();
      keyboard.nextLine();

      switch (option) {
        case 1:
          System.out.println("Escribe la tarea a agregar");
          String newTask = keyboard.nextLine();
          tasks.add(newTask);
          System.out.println("Tarea agregada");
          break;

        case 2:
          System.out.println("Escribe la tarea a eliminar");
          String removeTask = keyboard.nextLine();
          if (tasks.contains(removeTask)) {
            tasks.remove(removeTask);
            System.out.println("Tarea eliminada");
          } else {
            System.out.println("Tarea no encontrada");
          }

          break;
        case 3:
          System.out.println("Tareas pendientes: " + tasks);
          break;

        case 4:
          System.out.println("Escibe la tarea a marcar como completada");
          String completedTask = keyboard.nextLine();
          if (tasks.contains(completedTask)) {
            tasks.remove(completedTask);
            System.out.println("Tarea marcada como completada");
          } else {
            System.out.println("Tarea no encontrada");
          }
          break;
        case 5:
          System.out.println("Saliendo de la lista de tareas... Adios!");
          break;
      }

    }
    keyboard.close();
  }

  public static void showTasks(ArrayList<String> tasks) {
    System.out.println("Tareas pendientes: " + tasks);
  }

  public static void markTaskAsCompleted(ArrayList<String> tasks, String task) {
    if (tasks.contains(task)) {
      tasks.remove(task);
      System.out.println("Tarea marcada como completada");
    } else {
      System.out.println("Tarea no encontrada");
    }
  }
}
