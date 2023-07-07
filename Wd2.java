import java.util.*;
class Wd2
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	Date dt = new Date();
    	System.out.print("Enter Day   : ");
	int d = sc.nextInt();
    	System.out.print("Enter Month : ");
    	int m = sc.nextInt();
        System.out.print("Enter Year  : ");
    	int y = sc.nextInt();
     	dt.setYear(y);
    	dt.setMonth(m);
    	dt.setDay(d);
    	System.out.print("choose day-month-year (d/m/y): ");
    	char c=sc.next().charAt(0);
    	switch(c)    
    	{
            case 'd':
		System.out.print("Enter no.of days to be added: ");
        	d = sc.nextInt();
                dt.incrementDay(d);
		break;
            case 'm':
		System.out.print("Enter no.of months to be added: ");
        	m = sc.nextInt();
         	dt.incrementMonth(m);
            	break;
            case 'y':
  		y = sc.nextInt();
		System.out.print("Enter no.of years to be added: ");
                dt.incrementYear(y);
            	break;
        }
    	System.out.println("Day   : " + dt.getDay());
    	System.out.println("Month : " + dt.getMonth());
    	System.out.println("Year  : " + dt.getYear());
    }
}

class Date
{
    private int day;
    private int month;
    private int year;
    private int[] a = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public int isLeapYear(int year)
    {    
	if(year%400 == 0 || (year%100 != 0 && year%4==0))
	{
	    a[2] = 29;
            return 1;
	}
	else
	    a[2] = 28;
  	return 0;
    }
    private int validateYear(int year)
    {
	return year>0 ? year : 1900;
    }
    private int validateMonth(int month)
    {
 	return (month>0 && month<13) ? month : (month%12)+1;
    }
    private int validateDay(int day)
    {
	return (day>0 && day<=a[month]) ? day : (day%a[month])+1;
    }
    public Date() {}
    public void setDay(int day)       
    {
 	this.day = validateDay(day);
    }
    public void setMonth(int month)   
    {
    	this.month = validateMonth(month);
    }
    public void setYear(int year)
    {
    	this.year = validateYear(year);
    }
    public void incrementYear(int year)
    {
    	incrementDay(year*365);
    }
    public void incrementMonth(int month)
    {
    	incrementDay(month*30);
    }
    public void incrementDay(int day)
    {
    	int sum=0;
    	for(int i=1; i<month; i++)
    	{
            sum += a[i];
    	}
	sum+=this.day;
    	sum += day;
    	int f=0;
   	if(isLeapYear(year)==1)
    	{
            f=1;
    	}
    	int c=0;
   	while((f==1 && sum>=366) || (f==0 && sum>=365))
    	{
            if(f==1 && sum>=366)
            	sum-=366;
            else if(f==0 && sum>=365)
            	sum-=365;
            year++;
            if(isLeapYear(year)==1)
            {
            	f=1;
            }
        }
        if(isLeapYear(year)==1)
        {
            f=1;
        }
        int i=1;
        while(sum>a[i])
        {
            sum=sum-a[i++];
        }
        month=i;
        this.day=sum;
    }
    public int getYear()
    {
	return year;
    }
    public int getMonth()
    {
	return month;
    }
    public int getDay()
    {
	return day;
    }
}


    
      
 