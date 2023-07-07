import java.util.*;
class Wd1
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	Time t = new Time();
	System.out.print("Enter Hours   : ");
	int h = sc.nextInt();
	System.out.print("Enter Minutes : ");
	int m = sc.nextInt();
	System.out.print("Enter Seconds : ");
	int s = sc.nextInt();
	t.setHours(h);
	t.setMinutes(m);
	t.setSeconds(s);
	System.out.print("choose min-sec-hour(m/s/h) : ");
	char c=sc.next().charAt(0);
	switch(c)	
	{
	    case 's':
		    System.out.print("Enter no.of seconds to be incremented : ");
		    s = sc.nextInt();
	            t.incrementSeconds(s);
		    break;
	    case 'm':
		    System.out.print("Enter no.of minutes to be incremented : ");
		    m = sc.nextInt();
	            t.incrementMinutes(m);
		    break;
	    case 'h':
		    System.out.print("Enter no.of hours to be incremented : ");
		    h = sc.nextInt();
	            t.incrementHours(h);
		    break;
        }
	System.out.println("Hours   : " + t.getHours());
	System.out.println("Minutes : " + t.getMinutes());
	System.out.println("Seconds : " + t.getSeconds());
    }
    
}
	
class Time
{
    private int hours;
    private int minutes;
    private int seconds;
    private int validateHours(int hours)
    {
	return (hours>=0 && hours<24) ? hours : hours%24;
    }
    private int validateMinutes(int minutes)
    {
	return (minutes>=0 && minutes<60) ? minutes : minutes%60;
    }
    private int validateSeconds(int seconds)
    {
	return (seconds>=0 && seconds<60) ? seconds : seconds%60;
    }
    public Time() {}
    public void setHours(int hours)    
    {
	this.hours = validateHours(hours);
    }
    public void setMinutes(int minutes)
    {
	this.minutes = validateMinutes(minutes);
    }
    public void setSeconds(int seconds)
    {
	this.seconds = validateSeconds(seconds);
    } 
    public void incrementHours(int hours)
    {
	this.hours += hours;
	if(this.hours > 24)
	{
	    this.hours = this.hours%24;
	}
    }
    public void incrementMinutes(int minutes)
    {
	this.minutes += minutes;
	if(this.minutes > 60)
	{
	    incrementHours(this.minutes/60);
	    this.minutes = this.minutes%60;
	}
    }
    public void incrementSeconds(int seconds)
    {
	this.seconds += seconds;
	if(this.seconds > 60)
	{
	    incrementMinutes(this.seconds/60);
	    this.seconds = this.seconds%60;
	}
    }
    public int getSeconds()
    {
	return seconds;
    }
    public int getMinutes()
    {
	return minutes;
    }
    public int getHours()
    {
	return hours;
    }
}