class main2
{
	public static void main(String args[])
	{	
		circle c1=new circle(3.4);
		c1.getArea();
		c1.getPerimeter();
		rectangle r1=new rectangle(3,4);
		r1.getArea();
		r1.getPerimeter();
		square s1=new square(4);
		s1.getArea();
		s1.getPerimeter();
		
		
	}
}

class square {
    int x;

    public square(int x) {
        this.x = x;
    }

    void getArea() {
        System.out.println("the area is " + x * x);
    }

    void getPerimeter() {
        System.out.println("The perimeter is " + 4 * x);
    }
}
class rectangle
{
	int x,y;
	public rectangle(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
 void getArea()
	{	
		
		System.out.println("the area is "+x*y);
	}
	void getPerimeter()
	{
		
		System.out.println("The perimetr is "+2*(x+y));
	}
}

class circle
{
	double radius;
	public circle(double radius)
	{
		this.radius=radius;
	}
	
		
 void getArea()
	{
		
		System.out.println("the area is "+Math.PI*radius*radius);
	}
	 void getPerimeter()
	{	
		 
		System.out.println("The perimetr is "+2*Math.PI*radius);
	}
}
