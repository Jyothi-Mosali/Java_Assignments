import java.util.*;
class Test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence to count the no.of words : ");
		String s = sc.nextLine();
		int c=0,f=0;
		for(int i = 0 ; i < s.length(); i++)
		{
			if(s.charAt(i)!=' ')
		        {
				if(f==0)
				{
					f=1;c++;
				}
			}	
			else
				f=0;
		}
		System.out.print("No.of words : "+c);
	}
}
