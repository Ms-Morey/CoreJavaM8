import java.util.*;
class HackerRank_IBM_Example
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of chapters : ");
		int chpt = sc.nextInt();
		System.out.print("Starting date of leave : ");
		int start = sc.nextInt();
		System.out.print("End date of leave : ");
		int end = sc.nextInt();

		System.out.println(solve(chpt, start, end));
	}

	public static int solve(int chpt, int start, int end)
	{
		return(end-start>chpt)?chpt : (end-start)+1;
	}
}