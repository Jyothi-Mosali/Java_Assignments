import java.util.*;
class Test3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length  :");
		double l = sc.nextDouble();
		System.out.print("Enter Breadth :");
		double b = sc.nextDouble();
		Rectangle t = new Rectangle(l , b);
		System.out.println("area of Rectangle     : "+t.area());
		System.out.print("perimeter of Rectangle : "+ t.perimeter());
	}
}
class Rectangle
{
	double length;
	double breadth;
	public Rectangle(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return length+breadth;
	}
}
