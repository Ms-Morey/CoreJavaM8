import java.util.Scanner;
class Result
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks : ");
		float marks = sc.nextFloat();
		if (marks>=0 && marks <=600)
		{
			float per = (marks/600)*100;
			System.out.println("The percentage is : "+per+"%");
			
			if(per>90){
				System.out.println("Outstanding");
			}
			else if(per>75){
				System.out.println("First class with distinction");
			}
			else if(per>60){
				System.out.println("First Class");
			}
			else if(per>50){
				System.out.println("Second Class");
			}
			else if(per>=35){
				System.out.println("Passed");
			}
			else{
				System.out.println("You have failed");
				System.out.println("Re-appear for exam");
			}
		}else{
			System.out.println("Invalid Input");
		}
	}
}