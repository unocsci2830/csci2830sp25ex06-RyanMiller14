package pizza;
import java.util.Scanner;

import pizza.crust.*;
import pizza.sauce.*;
import pizza.topping.*;

public class PizzaMain {
	private Pizza pizza;
	private Scanner input;
	
	public PizzaMain() {
		pizza = new Pizza();
		input = new Scanner(System.in);
	}
	
	private void inputCrustChoice() {
		Boolean validChoice = false;
		System.out.println("What kind of crust would you like:");
		System.out.println("1 - Thin Crust");
		System.out.println("2 - Thick Crust");
		System.out.print("Your choice: ");
		while (!validChoice) {
			Integer choice = input.nextInt();
			switch(choice) {
				case 1: 
					pizza.setCrust(new ThinCrust());
					pizza.addMenuItem(new ThinCrust());
					validChoice = true;
					break;
				case 2: 
					pizza.setCrust(new ThickCrust());
					pizza.addMenuItem(new ThickCrust());
					Boolean validDeepDishChoice = false;
					System.out.println("Deep Dish?(y/n) ");
					while (!validDeepDishChoice) {
						String deepDishChoice = input.next();
						switch(deepDishChoice) {
							case "y":
								pizza.setIsDeepDish(true);
								validDeepDishChoice = true;
								break;
							case "n":
								pizza.setIsDeepDish(false);
								validDeepDishChoice = true;
								break;
							default:
								System.out.println("Pick between y/n");
						}
					}
					validChoice = true;
					break;
				default:
					System.out.println("Pick between 1-2");
			}
		}
	}

	private void inputIngredientChoice() {
		Boolean validChoice = false;
		System.out.println("What kind of crust ingredient would you like:");
		System.out.println("1 - Flour");
		System.out.println("2 - Cauliflower");
		System.out.print("Your choice: ");
		while (!validChoice) {
			Integer choice = input.nextInt();
			switch(choice) {
				case 1: 
					pizza.setIngredient(new FlourIngredient());
					pizza.addMenuItem(new FlourIngredient());
					validChoice = true;
					break;
				case 2: 
					pizza.setIngredient(new CauliflowerIngredient());
					pizza.addMenuItem(new CauliflowerIngredient());
					validChoice = true;
					break;
				default:
					System.out.println("Pick between 1-2");
			}
		}
	}

	private void inputSauceChoice() {
		Boolean validChoice = false;
		System.out.println("What kind of sauce would you like:");
		System.out.println("1 - Tomato Sauce");
		System.out.println("2 - Alfredo Sauce");
		System.out.print("Your choice: ");
		while (!validChoice) {
			Integer choice = input.nextInt();
			switch(choice) {
				case 1: 
					pizza.setSauce(new TomatoSauce());
					pizza.addMenuItem(new TomatoSauce());
					validChoice = true;
					break;
				case 2: 
					pizza.setSauce(new AlfredoSauce());
					pizza.addMenuItem(new AlfredoSauce());
					validChoice = true;
					break;
				default:
					System.out.println("Pick between 1-2");
			}
		}
	}

	private void inputToppingChoices() {
		System.out.print("How many toppings? ");
		Integer numToppings = input.nextInt();
		for (Integer i = 0; i < numToppings; i++) {
			Boolean validChoice = false;
			System.out.println("1 - Pepperoni");
			System.out.println("2 - Sausage");
			System.out.println("3 - Green Onion");
			System.out.println("4 - Olives");
			System.out.println("5 - Mozarella");
			System.out.println("6 - Parmesan");
			System.out.print("Your choice: ");
			while (!validChoice) {
				Integer choice = input.nextInt();
				switch(choice) {
					case 1: 
						pizza.addTopping(new PeperoniMeat());
						pizza.addMenuItem(new PeperoniMeat());
						validChoice = true;
						break;
					case 2: 
						pizza.addTopping(new SausageMeat());
						pizza.addMenuItem(new SausageMeat());
						validChoice = true;
						break;
					case 3: 
						pizza.addTopping(new GreenOnionVeggie());
						pizza.addMenuItem(new GreenOnionVeggie());
						validChoice = true;
						break;
					case 4: 
						pizza.addTopping(new OlivesVeggie());
						pizza.addMenuItem(new OlivesVeggie());
						validChoice = true;
						break;
					case 5: 
						pizza.addTopping(new MozarellaCheese());
						pizza.addMenuItem(new MozarellaCheese());
						validChoice = true;
						break;
					case 6: 
						pizza.addTopping(new ParmesanCheese());
						pizza.addMenuItem(new ParmesanCheese());
						validChoice = true;
						break;
					default:
						System.out.println("Pick between 1-6");
				}
			}
		}
	}
	
	private void showPizza() {
		pizza.display();
	}
	
	public void runMenu() {
		inputCrustChoice();
		inputIngredientChoice();
		inputSauceChoice();
		inputToppingChoices();
		showPizza();
	}
	
	public static void main(String[] args) {
		PizzaMain pm = new PizzaMain();
		pm.runMenu();

		// PizzaTopping topping = new MeatTopping();
		// System.out.println(topping.toNiceString());
		// topping = new CheeseTopping();
		// System.out.println(topping.toString());
		// topping = new VeggieTopping();
		// System.out.println(topping.toNiceString());
		
		// SausageTopping mtopping = new SausageTopping();
		// mtopping.setSpiciness(3);
		// System.out.println(mtopping.toNiceString());
	}
}
