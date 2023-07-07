import java.util.Scanner;
class LinearSearch1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a=new int[6];
		System.out.print("Enter 6 unsorted array Elements : ");
		for(int i=0;i<6;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter the Element to be checked : ");
		int f=0,k=sc.nextInt();
		for(int i=0;i<6;i++)
		{
			if(a[i]==k)
			{
				f=1;
				System.out.println(k+" Element found!");
				break;
			}
		}
		if(f==0)
			System.out.println("Element not found!");
	}
}