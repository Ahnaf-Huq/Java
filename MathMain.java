import java.util.*;
class MyMath
{
	double add(double a, double b)
	{
		return a+b;
	}
	int add(int x, int y)
	{
		return x+y;
	}
	double random()
	{
		return Math.random();
	}
	int random(int y)
	{
		Random r = new Random();
		return r.nextInt(y);
	}
	int factorial(int n)
	{
		int i = 1;
		int f = 1;
		while(i<=n){
			
			f = f*i;
			i++;
		}
		return f;
	}
	int factorialRecursive(int n)
	{
		if (n == 0){
			return 1;
		} else{
			return n*factorialRecursive(n-1);
		}
	}
	
	
		
}

class MathMain
{
	public static void main(String args[])
	{
		MyMath math1 = new MyMath();
		System.out.println("Add method with double parameter: "+math1.add(5.5,6.5));
		System.out.println("Add method with integer parameter: "+math1.add(32,23));
		System.out.println("Random method with double parameter: "+math1.random());	
		System.out.println("Random method with integer parameter: "+math1.random(50));
		System.out.println("Factorial of integer: "+math1.factorial(5));
		System.out.println("Factorial of integer: "+math1.factorialRecursive(5));

			


		
		
		
		
	}
}