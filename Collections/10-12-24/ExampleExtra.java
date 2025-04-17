import java.util.*;
class ExampleExtra
{
	public static void main(String[] args) 
	{
		// String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// boolean flag = true;
		// int j =0;
		// for(char i = 'A'; i<='Z'; i++)
		// {
		// 	if(!(str.charAt(j++)==i))
		// 	{
		// 		flag = false;
		// 		break;
		// 	}
		// 	if(flag)
		// 		System.out.println("panagram");
		// }


		StringBuffer sb = new StringBuffer(100);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
	}
}