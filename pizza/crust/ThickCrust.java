package pizza.crust;

public class ThickCrust extends PizzaCrust {
    private Boolean isDeepDish;
    
    public String toString() {
        return "Thick Crust";
    }

    public String toNiceString() {
        return "Crust is: " + this.toString() + " (" + this.crustPrice + ")" +
                "\nIngredient is: " + ingredient + " (" + this.ingredientPrice + ")" +
                "\nIs Deep Dish: " + isDeepDish;
    }

    public void setIsDeepDish(Boolean isDeepDish) {
        this.isDeepDish = isDeepDish;
    }

    public Double getPrice() {
        return 2.99;
    }
}
