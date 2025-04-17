
class Animal
{
	String name ;
	String species ;
	int lifeSpan ;
	String color ;
	String sound ;

	Animal(String name ,String species ,int lifeSpan , String color, String sound )
	{
		super();
		this.name = name ;
		this.species = species ;
		this.lifeSpan = lifeSpan ;
		this.color = color ;
		this.sound = sound ;
	}

	public void displayAnimal()
	{
		System.out.println(" *** Animal Details *** ");
		System.out.println("Name : "+this.name);
		System.out.println("Species : "+ this.species);
		System.out.println("lifeSpan : "+this.lifeSpan);
		System.out.println("Color : "+this.color);
		System.out.println("Sound : "+this.sound);
		System.out.println();
	}
}

class Dog extends Animal
{
	String breed ;
	String name ;
	String color ;
	int age ;
	String sound ;

	Dog(String breed, String name , String color , int age , String sound,String name1 ,String species ,int lifeSpan , String color1, String sound1 )
	{
		super(name1, species, lifeSpan, color1, sound1);
		this.breed = breed ;
		this.name = name ; 
		this.color = color ;
		this.age = age ;
		this.sound = sound ;
	}

	public void displayDog()
	{
		System.out.println("*** Dog Details ***");
		System.out.println("Breed : "+this.breed);
		System.out.println("Name : "+ this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Color : "+this.color);
		System.out.println("Sound : "+this.sound);
	}
}
class SingleLevInheritance
{
	public static void main(String[] args) 
	{
		Dog obj = new Dog("Germen","Sheperd", "black", 4, "Bark", "Dog", "Mamals", 12, "Black", "Barking");

		obj.displayAnimal();
		obj.displayDog();
	}
}