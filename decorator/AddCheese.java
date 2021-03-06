public class AddCheese extends PizzaToppings{

    int extraCheesePrice = 500;
    public AddCheese(Pizza addedToppings) {
        super(addedToppings);
    }

    public void order() {
        addedToppings.order();
        setPizza(addedToppings);
    }

    public void setPizza(Pizza addedToppings) {
        System.out.println("Toppings: Cheese Added");
        System.out.println("Total Price: RS " + (extraCheesePrice + 1000));
    }
}
