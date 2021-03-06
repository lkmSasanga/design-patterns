public class Cheese implements Pizza{
    static int pizzaPrice = 1000;
    public void order() {
        System.out.println("Pizza : Cheese");
        System.out.println("Price : RS " + pizzaPrice);
    }
}
