class Test
{
	void meth(int i, int j)
	{
		i *=i;
		j /=j;
		System.out.println("i and j after call: "+i+", "+j);
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
	}


}