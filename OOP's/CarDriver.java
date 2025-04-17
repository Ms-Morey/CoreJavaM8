class Car
{
	String brand ;
	String category ;
	int capacity ;
	String color ;
	String type ;
	//Engine engine ;
	Engine engine = new Engine("400", 6, "diesal", 6, 15);


	Car(String brand, String category, int capacity, String color , String type)//Engine engine
	{
		this.brand = brand;
		this.category = category;
		this.capacity = capacity;
		this.color = color;
		this.type = type;
		this.engine = engine;
	}

	public void displayCar()
	{
		System.out.println("Brand : "+ brand);
		System.out.println("Category of car (SUV, XUV etc ): "+category);
		System.out.println("Seating capacity : "+capacity);
		System.out.println("Car color : "+color);
		System.out.println("Type of car (Electric / Regular : "+type);
	}
}

class Engine
{
	String hoursePower ;
	int cylinders ;
	String fuelType ;
	int gears ;
	int mileage ;

	Engine(String hoursePower , int cylinders, String fuelType, int gears , int mileage)
	{
		this.hoursePower = hoursePower ;
		this.cylinders = cylinders ;
		this.fuelType = fuelType ;
		this.gears = gears ;
		this.mileage = mileage ;
	}

	public void displayEngine()
	{
		System.out.println("Hourse Power : "+hoursePower);
		System.out.println("No of cylinders : "+ cylinders);
		System.out.println("Type of fluel : "+fuelType);
		System.out.println("No of gears : "+ gears);
		System.out.println("Milege : "+ mileage +"km/l");
	}
}

class CarDriver
{
	public static void main(String[] args) 
	{
		//String hoursePower , int cylinders, String fuelType, int gears , int mileage
		Car c = new Car("TATA", "SUV",4,"White","Electric");//,(new engine("400",6,"Diesal",6,15))
		c.displayCar();
		c.engine.displayEngine();
	}
}