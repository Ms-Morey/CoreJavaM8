/*Facinating number is a number who is multiplied by 2 & three and the concatenation of num, (num*2), (num*3) , 
the digit it form must include numbers from 1-9, & every digit must apear only once in the number concatenated*/
import java.util.Scanner;
class FacinationNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num =sc.nextInt();//327
		
			String str = num+""+(num*2)+(num*3);
			boolean flag = true;

			for(char k ='1'; k<='9'; k++)
			{
				int count =0;
				for (int j =0;j<str.length(); j++ ) 
				{
					if(k==str.charAt(j))
						count++;
				}
				if(count!=1)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(num+" it is a facinating number");
			}
			else
			{
				System.out.println(num+" is is not a fainating number");
			}
	}
}