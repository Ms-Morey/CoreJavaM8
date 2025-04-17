class Mobile
{
	String brand ; 
	int ram ;
	int rom ;
	String color ;
	String proccesor ;
	int price ;

	Mobile(String brand,int ram,int rom,String color, String proccesor,int price )
	{
		this.brand = brand ;
		this.ram = ram ;
		this.rom = rom ;
		this.color = color ;
		this.proccesor = proccesor ;
		this.price = price ;
	}


	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile("Samsung", 8, 128, "Silver", "G90", 340000) ;
		m1.display() ;

		System.out.println();

		Mobile m2 = new Mobile("Apple", 8, 256, "Grey", "A12", 69000) ;
		m2.display() ;

		System.out.println();

		Mobile m3 = new Mobile("Realme", 6, 128, "Black", "Snapdragon", 150000) ;
		m3.display() ;

	}

	void display()
	{
		System.out.println("Brand : "+brand);
		System.out.println("RAM : "+ram);
		System.out.println("ROM : "+rom);
		System.out.println("Color : "+color);
		System.out.println("Processor : "+proccesor);
		System.out.println("Price : "+price);
	}
}