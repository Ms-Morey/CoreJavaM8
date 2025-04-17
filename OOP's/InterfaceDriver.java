interface Vehicle
{
	void seatingCapacity();
	void  price();
	void mileage();
	void brand();
}

interface Car extends Vehicle
{
	void airBags();
	void autoPilot();
}

interface Bike extends Vehicle
{
	void engineType();
	void typeBike();
}

class CarImplementation implements Car
{
	public void seatingCapacity()
	{
		System.out.println("Seating capacity is 6");
	}
	public void price()
	{
		System.out.println("Price is 3700000.00 rs");
	}
	public void mileage()
	{
		System.out.println("mileage is 15km/l");
	}
	public void brand()
	{
		System.out.println("Brand is : "+"TATA");
	}
	public void airBags()
	{
		System.out.println("No of Airbags is 6");
	}
	public void autoPilot()
	{
		System.out.println("No");
	}
}

class BikeImplementation implements Bike
{
	public void seatingCapacity()
	{
		System.out.println("Seating capacity is 2");
	}
	public void price()
	{
		System.out.println("Price is 170000.00 rs");
	}
	public void mileage()
	{
		System.out.println("mileage is 51km/l");
	}
	public void brand()
	{
		System.out.println("Brand is : "+"Honda");
	}
	public void engineType()
	{
		System.out.println("Engine type is : ");
	}
	public void typeBike()
	{
		System.out.println("Sports");
	}
}
class InterfaceDriver
{
	CarImplementation obj = new CarImplementation();
	car.seatingCapacity();
	car.price();
	car.mileage();
	car.brand();
	car.airBags();
	car.autoPilot();

	BikeImplementation bike = new BikeImplementation();
	bike.seatingCapacity();
	bike.price();
	bike.mileage();
	bike.brand();
	bike.engineType();
	bike.typeBike();
}