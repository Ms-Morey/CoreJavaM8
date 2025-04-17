//WAJP to find out cubes of first n natural numbers.
import java.util.Scanner;
class CubeOfnNaturalNumbers
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            int cube = i*i*i;
            System.out.println("The cube of "+i+" is "+cube);
        }
    }
}