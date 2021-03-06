public class AddChicken extends PizzaToppings {

    int extraChickenPrice = 500;
    public AddChicken(Pizza addedToppings) {
        super(addedToppings);
    }

    public void order() {
        addedToppings.order();
        setPizza(addedToppings);
    }

    public void setPizza(Pizza addedToppings) {
        System.out.println("Toppings: Chicken Added");
        System.out.println("Total Price: RS " + (extraChickenPrice + 1000));

    }
}
