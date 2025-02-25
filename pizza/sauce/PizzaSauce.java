package pizza.sauce;

import pizza.MenuItem;
public abstract class PizzaSauce implements MenuItem {
    public abstract String toString();

    public String toNiceString() {
        return "Sauce is: " + this.toString();
    }

    public Double getPrice() {
        return 0.00;
    }
}
