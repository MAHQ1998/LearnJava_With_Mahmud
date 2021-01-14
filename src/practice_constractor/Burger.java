package practice_constractor;

public class Burger {

	String nameOfBurger;
	char size;
	String topping;
	double priceOfBurger;
	int quantityOfBurger;
	double totalValue;
	boolean isBurgerAvilable;

	public Burger() {

	}

	public Burger(String nameOfMyBurger) {
		this.nameOfBurger = nameOfMyBurger;
		System.out.println("Burger name is  " + this.nameOfBurger);

	}

	public Burger(String nameOfTheBurger, char sizeOfBurger, String toppingOnBurger, double priceOfBurger,
			int quantityOfBurgers, double totalValueOfBurger, boolean isBurgersAvilable) {
		this.nameOfBurger = nameOfTheBurger;
		this.size = sizeOfBurger;
		this.topping = toppingOnBurger;
		this.priceOfBurger = priceOfBurger;
		this.quantityOfBurger = quantityOfBurgers;
		this.totalValue = totalValueOfBurger;
		this.isBurgerAvilable = isBurgersAvilable;

		System.out.println(
				"What kinds of Burger >" + nameOfBurger + "What size Of Burger  >" + size + "What is the topping >"
						+ topping + "What is the price >" + priceOfBurger + "How many burger >" + quantityOfBurger
						+ "Total cost of the burgers > " + totalValue + "Burger Availability >" + isBurgerAvilable);

	}

	public static void main(String[] args) {

		Burger burger = new Burger("DoubleChesee");

		Burger myBurger = new Burger("Op Burger");

		Burger burgerForLunch = new Burger("Lamb Burger >", 'L', "Goat cheese ", 10.70, 100, 1070.00, true);

	}

}
