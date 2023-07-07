import java.util.*;
class Test2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base   :");
		double base = sc.nextDouble();
		System.out.print("Enter Height :");
		double height = sc.nextDouble();
		Triangle t = new Triangle(base , height);
		System.out.println("area of Triangle      : "+t.area());
		System.out.print("perimeter of Triangle : "+ t.perimeter());
	}
}
class Triangle
{
	double base;
	double height;
	public Triangle(double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	public double area()
	{
		return 0.5*base*height;
	}
	public double perimeter()
	{
		return 3*base;
	}
}
