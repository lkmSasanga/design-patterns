public class AddOnion extends PizzaToppings {

    int extraOnionPrice = 500;

    public AddOnion(Pizza addedToppings) {
        super(addedToppings);
    }

    public void order() {
        addedToppings.order();
        setPizza(addedToppings);
    }

    public void setPizza(Pizza addedToppings) {
        System.out.println("Toppings: Onions Added");
        System.out.println("Total Price: RS " + (extraOnionPrice + 1000));

    }
}
