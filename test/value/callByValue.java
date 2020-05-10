package test.value;
class Test
{
	int i; int j;
	void meth(int i, int j)
	{
		i *=i;
		j /=j;
		System.out.println("i and j after call: "+i+", "+j);
	}
	
	void meth(Test obj)
	{
		obj.i = obj.i + 2;
		obj.j = obj.j - 2;
	}
	void print()
	{
		System.out.println("i: "+i+" j: "+j);
	}
	Test(int i, int j)
	{
		this.i = i;
		this.j = j;
		
	}
	Test()
	{
		
	}

}

class callByValue
{
	public static void main(String args[])
	{
		Test ob = new Test();
		int a =15; int b = 20;
		System.out.println("a and b before call: "+a+", "+b);
		ob.meth(a,b);
		System.out.println("a and b after call: "+a+", "+b);
		
		Test ob2 = new Test(5,6);
		ob2.print();
		
		Test ob3 = new Test(10,12);
		ob3.print();
		ob3.meth(ob2);
		ob2.print();
	}


}