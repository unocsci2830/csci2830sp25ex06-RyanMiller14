package pizza.crust;

import pizza.MenuItem;
public abstract class PizzaCrust implements MenuItem {
    public abstract String toString();

    protected String ingredient;
    protected Double crustPrice;
    protected Double ingredientPrice;

    public String toNiceString() {
        return "Crust is: " + this.toString() + " (" + this.crustPrice + ")" +
                "\nIngredient is: " + ingredient + " (" + this.ingredientPrice + ")";
    }

    public String pizzaIntegrity() {
        if (this.toString() == "Thick Crust" && ingredient == "Cauliflower") {
            return "Warning: Handle this pizza very carefully.";
        } else {
            return "";
        }
    }

    public Double getPrice() {
        return 0.00;
    }

    public double getCrustPrice() {
        return crustPrice;
    }

    public void setCrustPrice(double crustPrice) {
        this.crustPrice = crustPrice;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public double getIngredientPrice() {
        return ingredientPrice;
    }

    public void setIngredientPrice(double ingredientPrice) {
        this.ingredientPrice = ingredientPrice;
    }
}
