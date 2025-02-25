package pizza;
import java.util.ArrayList;

import pizza.crust.*;
import pizza.sauce.*;
import pizza.topping.*;

public class Pizza implements MenuItem {
	private PizzaCrust crust;
	private Boolean isDeepDish;
	private PizzaCrust ingredient;
	private PizzaSauce sauce;
	private ArrayList<PizzaTopping> toppingList;
	private ArrayList<Object> menuItemList;
	public Pizza() {
		this.crust = null;
		this.ingredient = null;
		this.isDeepDish = false;
		this.sauce = null;
		this.toppingList = new ArrayList<PizzaTopping>();
		this.menuItemList = new ArrayList<Object>();

	}

	public PizzaCrust getCrust() {
		return this.crust;
	}

	public void setCrust(PizzaCrust crust) {
		this.crust = crust;
		this.crust.setCrustPrice(crust.getPrice());
	}

	public PizzaCrust getIngredient() {
		return this.ingredient;
	}

	public void setIngredient(PizzaCrust ingredient) {
		this.ingredient = ingredient;
		this.crust.setIngredient(ingredient.toString());
		this.crust.setIngredientPrice(ingredient.getPrice());
	}

	public Boolean getIsDeepDish() {
		return this.isDeepDish;
	}

	public void setIsDeepDish(Boolean isDeepDish) {
		this.isDeepDish = isDeepDish;

		if (this.crust instanceof ThickCrust) {
			((ThickCrust)this.crust).setIsDeepDish(isDeepDish);
		}
	}

	public PizzaSauce getSauce() {
		return this.sauce;
	}

	public void setSauce(PizzaSauce sauce) {
		this.sauce = sauce;
	}

	public ArrayList<PizzaTopping> getTopping() {
		return this.toppingList;
	}

	public void setTopping(ArrayList<PizzaTopping> toppings) {
		this.toppingList = toppings;
	}

	public void addTopping(PizzaTopping topping) {
		this.toppingList.add(topping);
	}

	public ArrayList<Object> getMenuItemList() {
		return this.menuItemList;
	}

	public void addMenuItem(Object menuItem) {
		this.menuItemList.add(menuItem);
	}

	public Double getPrice() {
		Double price = 0.00;
		for (Object item : this.menuItemList) {
			price += ((MenuItem)item).getPrice();
		}
		return price;
    }
	
	public void display() {
		System.out.println(this.crust.toNiceString());
		System.out.println(this.sauce.toNiceString() + " (" + this.sauce.getPrice() + ")");
		for (PizzaTopping t : this.toppingList) {
			System.out.println(t.toNiceString() + " (" + t.getPrice() + ")");
		}
		System.out.println(this.crust.pizzaIntegrity());
		System.out.println("Total Price: " + this.getPrice());
	}
}
