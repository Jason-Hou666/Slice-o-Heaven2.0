public class SliceoHeavenOrder {
  public String storeName;
  public String storeAddress;
  public String storeMenu;
  public long storePhoneNumber;
  public String storeEmail;
  public String pizzaPrice;
  public String sides;
  public String drinks;

  public final String DEF_ORDER_ID = "DEF-SOH-099";
  public final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
  public final double DEF_ORDER_TOTAL = 15.00;

  private String orderID;
  private String orderDetails;
  private double orderTotal;
  private String pizzaIngredients;

  public SliceoHeavenOrder() {
    this.orderID = DEF_ORDER_ID;
    this.pizzaIngredients = DEF_PIZZA_INGREDIENTS;
    this.orderTotal = DEF_ORDER_TOTAL;
    this.sides = "";
    this.drinks = "";
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

  public String getOrderDetails() {
    return orderDetails;
  }

  public void setOrderDetails(String orderDetails) {
    this.orderDetails = orderDetails;
  }

  public double getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(double orderTotal) {
    this.orderTotal = orderTotal;
  }

  public String getPizzaIngredients() {
    return pizzaIngredients;
  }

  public void setPizzaIngredients(String pizzaIngredients) {
    this.pizzaIngredients = pizzaIngredients;
  }

  public void takeOrder(String id, String details, double total) {
    orderID = id;
    orderDetails = details;
    orderTotal = total;

    System.out.println("Order accepted!");
    System.out.println("Order is being prepared");

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      System.out.println("Order is ready for pickup!");
    }

    System.out.println("Your order is ready!");
    makePizza();

    printReceipt();
  }

  private void makePizza() {
    System.out.println("Making the pizza...");
    System.out.println("Your Pizza is made!");
  }

  private void printReceipt() {
    System.out.println("********RECEIPT********");
    System.out.println("Order ID: " + orderID);
    System.out.println("Order Details: " + orderDetails);
    System.out.println("Order Total: " + orderTotal);
  }
}