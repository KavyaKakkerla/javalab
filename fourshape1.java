import java.util.*;


class shape
{	
	double r;
	public void getArea(int x)
	{
	r=x*x;
	System.out.println("the area is "+r);
	}
	public void getPerimeter(int x)
	{	
	r=4*x;
		System.out.println("The perimetr is "+r);
	}
	public void getArea(int x,int y)
	{	
		r=x*y;
		System.out.println("the area is "+r);
	}
	public void getPerimeter(int x,int y)
	{
		r=2*(x+y);
		System.out.println("The perimetr is "+r);
	}
	public void getArea(double x)
	{
		r=Math.PI*x*x;
		System.out.println("the area is "+r);
	}
	public void getPerimeter(double x)
	{	
		 r=2*Math.PI*x;
		System.out.println("The perimetr is "+r);
	}

	
}

	
	
class Demo
{
	public static void main(String args[])
	{	int x;
		shape obj1=new shape();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the side of Square");
		//x=sc.nextInt();
		obj1.getArea(3);
		obj1.getPerimeter(4);
		obj1.getArea(2.3);
		obj1.getPerimeter(5.9);
		obj1.getArea(3,4);
		obj1.getPerimeter(4,8);
		
	}
}
		
		
	
