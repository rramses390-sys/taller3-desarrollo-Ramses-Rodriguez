import java.util.ArrayList;

public class GradeCalculator {
  public static void main(String[] args) {
    ArrayList<Double> grades = new ArrayList<>();

    grades.add(85.0);
    grades.add(90.0);
    grades.add(75.0);
    grades.add(69.0);
    grades.add(88.0);

    double average = calculatoraverage(grades);
    System.out.println("Tu nota final es: " + average);

    if (average >= 71) {
      System.out.println("Felicidades, tu nota es aprobatoria");
    } else {
      System.out.println("Tu nota no es aprobatoria");
    }
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
