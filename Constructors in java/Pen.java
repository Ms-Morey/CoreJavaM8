class Pen
{
	String brand ;
	String color ;
	int cost ;
	String type ;

	Pen(String brand, String color , int cost , String type)
	{
		this.brand = brand ;
		this.color = color ;
		this.cost = cost ;
		this.type = type ;
	}

	public static void main(String[] args) 
	{
		Pen p1 = new Pen("Renolds", "Blue", 30, "Gel") ;
		p1.display() ;

		System.out.println("___________________________________________");
		System.out.println();

		Pen p2 = new Pen("Butterflow", "Black", 10, "BallPen") ;
		p2.display() ;

		System.out.println("___________________________________________");
		System.out.println();

		Pen p3 = new Pen("Pentonic", "Red", 15, "BallPen") ;
		p3.display() ;
	}

	void display()
	{
		System.out.println(brand);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(type);
	}
}