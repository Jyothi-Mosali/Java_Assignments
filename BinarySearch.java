import java.util.*;
class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 6 sorted array Elements : ");
		int[] a = new int[6];
		for(int i=0;i<a.length;i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int low = 0,high = a.length-1;
		System.out.print("Enter the Element to be checked : ");
		int mid,k = sc.nextInt();
		int flag=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]<k)
				low = mid+1;
			else if(a[mid]>k)
				high = mid-1;
			else
			{
				flag=1;
				System.out.println(k+" Element found at an index "+mid);
				break;
			}
		}
		if(flag==0)
			System.out.println("Element not found");
	}
}