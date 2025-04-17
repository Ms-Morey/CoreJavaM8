import java.util.*;
class E_Pam_2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String str = "alphxxdida";
		System.out.println(compareString(str));	
	}

	public static int compareString(String str)
	{
		int count = 0;

		for(int i = str.length()-1, j=0; i>=0; i--,j++)
		{
			if(str.charAt(i)==str.charAt(j))
				count++;
		}
		return count;
	}
}