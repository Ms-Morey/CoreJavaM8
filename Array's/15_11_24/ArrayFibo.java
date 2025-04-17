import java.util.*;
class ArrayFibo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of fibo Array : ");
		int size = sc.nextInt();
		int [] fiboArr = new int[size];
		fiboArr[0] = 0;
		fiboArr[1] = 1;

		int prev = 0;
		int curr = 1;

		for(int i = 2; i<size; i++)
		{
			int next = prev+curr;
			prev = curr;
			curr = next;
			fiboArr[i] = next;
		}

		System.out.println(Arrays.toString(fiboArr));
	}
}