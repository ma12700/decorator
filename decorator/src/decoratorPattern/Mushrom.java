package decoratorPattern;

public class Mushrom extends ToppingDecorator {

Pizza pizza;
	
	public Mushrom(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " ,With Mushrom";
	}

	@Override
	public double cost() {
		return 0.25 + pizza.cost();
	}

}
