public class SliceoHeavenOrder{
  public final String DEF_ORDER_ID = "DEF-SOH-099"; 
  public final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese"; 
  public final double DEF_ORDER_TOTAL = 15.00;
  
  private String orderID;
  private String pizzaIngredients;
  private double orderTotal;

  public SliceoHeavenOrder() {
  this.orderID = DEF_ORDER_ID;
  this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
  this.orderTotal = DEF_ORDER_TOTAL;
  }
  public SliceoHeavenOrder(String orderID, String pizzaIngredients, double orderTotal) {
    this.orderID = orderID;
    this.pizzaIngredients = pizzaIngredients;
    this.orderTotal = orderTotal;
  }
  public String getOrderID() {
    return orderID; 
  }

  public void setOrderID(String orderID) {
    this.orderID = orderID; 
  }
  public String getPizzaIngredients() {
    return pizzaIngredients; 
  }

  public void setPizzaIngredients(String pizzaIngredients) {
    this.pizzaIngredients = pizzaIngredients; 
  }
public double getOrderTotal() {
    return orderTotal; 
  }

public void setOrderTotal(double orderTotal) {
    this.orderTotal = orderTotal; 
  }

private void printReceipt() {
    System.out.println("OrderID: " + orderID); 
    System.out.println("PizzaIngredients: " + pizzaIngredients); 
    System.out.println("OrderTotal: " + orderTotal); 
}
public void displayReceipt() {
  printReceipt(); 
}
}
