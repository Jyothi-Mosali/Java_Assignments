import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to be reversed : ");
		String s = sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev.concat(s.valueOf(s.charAt(i)));
		}
		System.out.print(rev);
	}
}
