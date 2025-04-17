import java.util.*;
//Sorting an object based on it's Attributes
class Student
{
	int sid;
	String sname;
	String branch;
	int yop;
	double cgpa;

	Student(int sid, String sname, String branch, int yop , double cgpa)
	{
		this.sid = sid;
		this.sname = sname; 
		this.branch = branch;
		this.yop = yop;
		this.cgpa =cgpa;
	}


	@Override
	public String toString()
	{
		return sid+". "+sname+", Branch : "+branch+" ,YOP : "+yop+" CGPA : "+cgpa;
	}

}

class Driver
{
	public static void main(String[] args) 
	{
		Student [] a = new Student[5];

		a[0] = new Student(1, "SIDHESH", "IT",2024, 7.93);
		a[1] = new Student(4, "OMKAR", "IT",2024, 8.73);
		a[2] = new Student(3, "ADITYA", "CS",2025, 8.46);
		a[3] = new Student(5, "SANKET", "IT",2023, 7.56);
		a[4] = new Student(2, "MAHESH", "CS",2025, 8.02);

		System.out.println();
		//Sorting By Id Asc
		System.out.println("Sorted By ID : ");
		bubleSortById(a);
		for(Student stud :a)
			System.out.println(stud);
		System.out.println("_______________________________________________");

		//Sorting By Name ASC
		System.out.println("Sorting By Name ASC : ");
		bubleSortByName(a);
		for(Student stud : a)
			System.out.println(stud);
		System.out.println("_______________________________________________");


		//Sorting By YOP Desc
		System.out.println("Sorting By YOP DESC :");
		bubleSortByYop(a);
		for(Student stud : a)
			System.out.println(stud);
		System.out.println("_______________________________________________");

		//Sorting By Cgpa ASC
		System.out.println("Sorting By Cgpa ASC :");
		bubleSortByCgpaASC(a);
		for(Student stud : a)
			System.out.println(stud);
		System.out.println("_______________________________________________");

		//Sorting By cgpa DESC
		System.out.println("Sorting By Cgpa DESC :");
		bubleSortByCgpaDESC(a);
		for(Student stud : a)
			System.out.println(stud);
		System.out.println("_______________________________________________");
	}

	//bubleSortById
	public static void bubleSortById(Student [] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i].sid>arr[j].sid)
				{
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	//buble Sort ByName
	public static void bubleSortByName(Student [] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i].sname.compareTo(arr[j].sname)>0)
				{
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}		

	//Buble Sort ByYOP (Desc)
	public static void bubleSortByYop(Student [] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i].yop<arr[j].yop)
				{
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}		

	//Buble sort By Cgpa (Ascending)
	public static void bubleSortByCgpaASC(Student [] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i].cgpa>arr[j].cgpa)
				{
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}		

	//Buble sort By Cgpa (Descending)
	public static void bubleSortByCgpaDESC(Student [] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i].cgpa<arr[j].cgpa)
				{
					Student temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
	}		
}