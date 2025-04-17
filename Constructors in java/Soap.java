class Soap
{
	String brand ;
	int price ;
	String scent ;
	String category ;

	Soap(String brand, int price, String scent, String category)
	{
		this.brand = brand ;
		this.price = price ;
		this.scent = scent ;
		this.category = category ;
	}

	void display()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Price : "+price);
		System.out.println("Scent/Fragrance : "+scent);
		System.out.println("category : "+category);
	}

	public static void main(String[] args) 
	{
		Soap s1 = new Soap("Cinthol", 40, "lavender", "Beauty Soap") ;
		s1.display() ;

		System.out.println();

		Soap s2 = new Soap("SurfExcel", 30, "lemony", "Laundry Soap") ;
		s2.display() ;

		System.out.println();

		Soap s3 = new Soap("Hiderma", 120, "floral", "vetnary soap") ;
		s3.display() ;j
	}

}