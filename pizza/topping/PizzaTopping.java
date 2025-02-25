package pizza.topping;

import pizza.MenuItem;
public abstract class PizzaTopping implements MenuItem {
    public abstract String toString();

    public String toNiceString() {
        return "Topping is: " + this.toString();
    }

    public Double getPrice() {
        return 0.00;
    }
}