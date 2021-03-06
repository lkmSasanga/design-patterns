
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Pizza cheese = new Cheese();

        Pizza ChickenAddedCheesePizza = new AddChicken(new Cheese());

        Pizza OnionAddedChickenPizza = new AddOnion(new Chicken());


        System.out.println("Cheese pizza");
        cheese.order();

        System.out.println("\nCheese pizza with chicken");
        ChickenAddedCheesePizza.order();

        System.out.println("\nChicken Pizza with onions");
        OnionAddedChickenPizza.order();

    }
}
