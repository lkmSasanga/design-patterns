public abstract class PizzaToppings implements Pizza {
    protected Pizza addedToppings;

    public PizzaToppings(Pizza addedToppings) {
        this.addedToppings = addedToppings;
    }

    public void order() {
        addedToppings.order();
    }
}
