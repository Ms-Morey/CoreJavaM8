import java.util.Scanner;
public class seriesproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int count =0;
        for(int i = 2;i<=num/2;i++)
        {
    	  if(num%i==0)
    	  {
    		  count++;
    		  break;
    	  }
       }  
       System.out.println((count==0)?"Prime":"Not prime");
	}

}