public class App {
    public static void main (String[] args) {
    SliceoHeavenOrder order = new SliceoHeavenOrder();
    SliceoHeavenOrder order2= new SliceoHeavenOrder("DEF-SOH-099","Mozzarella Cheese",15.00);
    System.out.println("OrderID is:" + order2.getOrderID());
    System.out.println("PizzaIngredients is:" + order2.getPizzaIngredients());
    System.out.println("OrderTotal is:" + String.format("%.2f",order.getOrderTotal()));
}
    
}
