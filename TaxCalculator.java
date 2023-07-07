import java.util.*;
class TaxCalculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,ans=0;
		System.out.print("Enter the Salary: ");
		n=sc.nextInt();
		n=n*12;
		int[] a={250000,500000,1000000};
		if(n<=a[0]);
		else if(n<=a[1])
		{
			ans+= ((n-a[0])*0.1);
		}
		else if(n<=a[2])
		{
			ans+=((a[0]*0.1)+((n-a[1])*0.2));
		}
		else
		{
			ans+=((a[0]*0.1)+(a[1]*0.2)+((n-a[1])*0.2));
		}
		System.out.println(ans);
	}
}