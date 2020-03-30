package decoratorPattern;

public class Restaurant {

	public static void main(String[] args) {
		
		Pizza pizza = new Tuna();
		pizza = new Tomato(pizza);
		pizza = new Pepper(pizza);
		pizza = new Olive(pizza);
		pizza = new Mushrom(pizza);
		pizza = new Mushrom(pizza);
		System.out.println(pizza.getDescription()
				+ " $" + pizza.cost());
	}

}
