package practice_constractor;

public class Car {
	String brand;
	int rPrice;
	String engine;

	public Car(String carBrandName, int carPrice, String carEngine) {
		this.brand = carBrandName;
		this.rPrice = carPrice;
		this.engine = carEngine;
	}

	public static void main(String[] args) {
		Car car1 = new Car("BMW", 80, "Automatic");
		Car car2 = new Car("Audi", 85, "Automatic");
		Car car3 = new Car("Toyota", 45, "Manual");

		System.out.println(car1.brand + " |" + car1.rPrice + " |" + car1.engine);

	}

}
