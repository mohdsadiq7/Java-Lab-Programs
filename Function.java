import java.util.Scanner;
import java.lang.String;

public class Function
{
	protected String shapeName;
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		double leng,wid,le,rad;
		
		rad=input.nextDouble();
		Shape circle = new circle(rad);
		Function f=new Function();
		System.out.println(f.getName("circle:")+"\n");
		System.out.println(" Circle radius: " +rad+ "\n Area: " + circle.getArea()+ "\n Perimeter: " + circle.getPerimeter() + "\n");
		
		le=input.nextDouble();
		Shape square=new square(le);
		System.out.println(f.getName("square:")+"\n");
		System.out.println("Square side :" +le+ "\n Area: " + square.getArea()+ "\n Perimeter: " + square.getPerimeter() + "\n");
		
		leng=input.nextDouble();
		wid=input.nextDouble();
		Shape rectangle=new rectangle(leng,wid);
		
		System.out.println(f.getName("rectangle:")+"\n");
		System.out.println(" Rectangle width: " + wid + " and length: " + leng+ "\n Area: " + rectangle.getArea()+ "\n Perimeter: " + rectangle.getPerimeter() + "\n");
		
		
	}
	
	public String getName(String shapeName)
	{
		
		return shapeName;
	}
	
}

abstract class Shape
{
	public abstract double getArea();
	public abstract double getPerimeter();

}



class circle extends Shape
{
	private double radius;
    double pi = Math.PI;
    
	public circle(double rad) {
		radius=rad;
	}
	public double getArea()
	{
		return pi * Math.pow(radius, 2);
	}
	public double getPerimeter()
	{
		return 2 * pi * radius;
	}
}



class square extends Shape
{
	private double length;
	 square() 
	 {
	        length=0;
	    }   
	
	public square(double le) 
	{
		length=le;
	}
	public double getArea()
	{
		return (length*length);
	}
	public double getPerimeter()
	{
		return (4 * length);
	}
	
}



class rectangle extends square
{
	private double length,width;
	
	public rectangle(double leng,double wid) 
	{
		length=leng;
		width=wid;
	}
	public double getArea()
	{
		return (length * width);
	}
	public double getPerimeter()
	{
		return 2*(length + width);
	}
	
}