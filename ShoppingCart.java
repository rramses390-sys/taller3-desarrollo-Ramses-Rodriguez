import java.util.ArrayList;

public class ShoppingCart {
  public static void main(String[] args) {
    ArrayList<Double> prices = new ArrayList<>();

    prices.add(15.99);
    prices.add(17.50);
    prices.add(9.99);
    prices.add(15.50);
    prices.add(5.99);

    Double total = calculateTotal(prices);

    System.out.println("--- Total de compra ---");
    System.out.println("Carrito de compras" + prices);
    System.out.println("Total a pagar es de: $ " + total);
  }

  public static double calculateTotal(ArrayList<Double> priceslist) {
    double sum = 0;
    for (double price : priceslist) {
      sum += price;
    }
    return sum;
  }

}