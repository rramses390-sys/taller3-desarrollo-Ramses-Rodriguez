import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {
  public static void main(String[] args) {
    ArrayList<Double> grades = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);
    int option = 0;

    System.out.println("\n----------------------------------");
    System.out.println("Esta es tu calcuadora de notas");
    System.out.println("\n----------------------------------");
    System.out.println("preciona 0 para avanzar");

    option = keyboard.nextInt();

    while (option != 3) {
      System.out.println("oprime 1 para ingresar tus notas");
      System.out.println("oprime 2 para calcular tu nota");
      System.out.println("oprime 3 para salir");
      System.out.print("Opcion: ");
      option = keyboard.nextInt();

      switch (option) {
        case 1: {
          System.out.println("ingresa tus notas (escribe 0 para terminar de ingresar notas)");
          while (true) {
            double grade = keyboard.nextDouble();
            if (grade == 0) {
              break;
            }
            grades.add(grade);
          }
          break;
        }
        case 2: {
          if (grades.isEmpty()) {
            System.out.println("La lista es vacia, ingresa tus notas primero");
          } else {
            double average = calculatoraverage(grades);
            System.out.println("Tu nota final es: " + average);

            if (average >= 71) {
              System.out.println("Felicidades, tu nota es aprobatoria");
            } else {
              System.out.println("Tu nota no es aprobatoria");
            }
          }
          break;
        }
        case 3: {
          System.out.println("Gracias por usar la calculadora de notas, hasta luego!");
          break;
        }
      }
    }
    keyboard.close();
  }

  public static double calculatoraverage(ArrayList<Double> grades) {
    int totalGrades = grades.size();
    if (totalGrades == 0) {
      return 0.0;
    }
    double sum = 0.0;
    for (double grade : grades) {
      sum += grade;

    }
    return sum / grades.size();
  }
}
