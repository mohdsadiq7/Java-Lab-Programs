
import java.util.Scanner;
public class Number {
	int value1;
	int value2;
	
public static void main(String[] args)
{
	
	Scanner input=new Scanner(System.in);
	
	binary b=new binary();
	octal o=new octal();
	decimal d=new decimal();
	
	while(true)
	{
		System.out.println("Enter the type of Addition you want\n1.Binary\n2.Octal\n3.Decimal\n");
		System.out.println("Enter the choice: ");
	    int n=input.nextInt();
	if(n==1)
	{
		b.add();
	}
	else if(n==2)
	{
		o.add();
	}
	else if(n==3)
	{
		d.add();
	}
	else
	{
		System.out.println("wrong option\n");
		System.exit(0);
	}
	}
}
}

interface Interface1
{
	void add();
}

class binary extends Number implements Interface1
{
	public void add()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers :\n");
		String a=input.next();
		String b=input.next();
		value1=Integer.parseInt(a,2);
		value2=Integer.parseInt(b,2);
		System.out.println("Binary addition = "+Integer.toBinaryString(value1+value2));
		
	}
}

class octal extends Number implements Interface1
{
	public void add()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers :\n");
		String a=input.next();
		String b=input.next();
		value1=Integer.parseInt(a,8);
		value2=Integer.parseInt(b,8);
		System.out.println("Octal addition = "+Integer.toOctalString(value1+value2));
	}
}

class decimal extends Number implements Interface1
{
	public void add()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers :\n");
		value1=input.nextInt();
		value2=input.nextInt();		
		System.out.println("Decimal addition = "+(value1+value2));
	}
}