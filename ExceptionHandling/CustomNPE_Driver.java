class CustomeNullPointerException extends RuntimeException
{
	CustomeNullPointerException()
	{
		super("Cannot invoke name because it's null");
	}
	CustomeNullPointerException(String desc)
	{
		super(desc);
	}
}
class Student
{
	String name;
}
class CustomNPE_Driver
{
	public static void main(String[] args) 
	{
		Student obj = null ;
		if(obj!=null)
			System.out.println(obj.name);
		else{
			try{
				throw new CustomeNullPointerException("Cannot invoke name because it's null");
			}
			catch(CustomeNullPointerException cnpe){
				System.out.println(cnpe.getMessage());
			}
		}
	}
}