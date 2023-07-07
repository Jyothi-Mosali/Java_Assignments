import java.util.Scanner;
class ElectricBill
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cmr,pmr,Bu,Ba=0;
		System.out.print("Enter the CMR: ");
		cmr=sc.nextInt();
		System.out.print("Enter the PMR: ");
		pmr=sc.nextInt();
		Bu=cmr-pmr;
		System.out.print("Choose (D/C/I) : ");
		char c=sc.next().charAt(0);
		switch(c)
		{
		     case 'D':
			if(Bu<=100)
			   Ba+=Bu;
			else if(Bu<=200)
			   Ba+=(((Bu-100)*2)+100);
			else
			   Ba+=(100+(100*2)+((Bu-200)*3));
			break;
		    case 'C':
			if(Bu<=100)
			   Ba+=(Bu*2);
			else if(Bu<=200)
			   Ba+=(((Bu-100)*4)+(100*2));
			else
			    Ba+=((100*4)+(100*2)+((Bu-200)*6));
			break;
		   case 'I':
			if(Bu<=100)
			   Ba+=(Bu*3);
			else if(Bu<=200)
 			   Ba+=(((Bu-100)*6)+(100*3));
			else
			   Ba+=((100*3)+(100*6)+((Bu-200)*9));
			break;
		}
		System.out.println("Billing unit   : "+ Bu);
		System.out.println("Billing amount : "+ Ba);
	}
}