import java.util.*;
class Mathematics
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
	
		
	
	
}

class MathMain
{
	public static void main(String args[])
	{
		Mathematics math1 = new Mathematics();
		System.out.println("Add method with double parameter: "+math1.add(5.5,6.5));
		System.out.println("Add method with integer parameter: "+math1.add(32,23));
		System.out.println("Random method with double parameter: "+math1.random());	
		System.out.println("Random method with integer parameter: "+math1.random(50));
		System.out.println("char"+"At");
		String str1 = new String("abcde");
		String str2 = "asimple abcde.";
		String str3 = str1+str2;
		System.out.println(str3);
		str3 = str2.concat(str1);
		System.out.println(str3);
		char a = str1.charAt(3);
		System.out.println(a);
		int d = str2.compareTo(str1);
		if (d>0) {
			
			System.out.println("str2 > str1");
		} else if (d<0) {
			System.out.println("str2 < str1");
		} else {
			System.out.println("Equal");
		}
		
		String str4 = "defg";
		String str5 = "defg";
		
		if (str4 == str5){
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		if (str4.equals(str5)){
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		int o = str2.indexOf(str1);
		System.out.println(o);
		System.out.println(str4.length());
		System.out.println("a quick brown fox".length());
		String color1= "red is my fav color. I like red trouser";
		System.out.println(color1.replace("red","blue"));
		System.out.println(color1.toLowerCase());
		System.out.println(color1.toUpperCase());
		System.out.println("Substring: "+color1.substring(7,20));
		String rst[] = color1.split(" ");
		for (int i = 0;i<rst.length;i++){
			System.out.println(rst[i]);
		}
		for (String s:rst){
			System.out.println(s);
		}
			


		
		
		
		
	}
}