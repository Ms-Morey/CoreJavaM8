import java.util.*;
class AccentureProblem1
{
	public static void main(String[] args)
	{
		int [] sem1 = {40,60,35,48,68,80};
		int [] sem2 = {20,80,70,68,48,70};
		int [] result = new int[sem1.length];

		for(int i = 0; i<sem1.length; i++)
			result[i] = sem2[i]-sem1[i];
		
		Arrays.sort(result);
		int totalMarks =0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		int cnt = sc.nextInt();

		for(int i = result.length-1; i>=0; i--)
		{
			if(result[i]>0 && cnt!=0)
			{
				totalMarks+=result[i];
				cnt--;
			}
		}
		if(totalMarks>=35)
			System.out.println("Pass "+totalMarks);
		else
			System.out.println("Fail "+totalMarks);
	}
}

