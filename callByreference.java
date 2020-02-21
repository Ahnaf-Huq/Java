class Test{
	int a,b;
	Test(int i){
		a = i;
	}
	Test incrByten(){
		Test temp = new Test(a+10);
		return temp;
	}
	}
}

class ReturnObject {
	public static void(String args[])
	{
		Test obj1 = new Test(2);
		Test obj2;
		obj2 = obj1.incrByten();
		System.out.println("obj1.a"+obj1.a);
		System.out.println("obj2.a"+obj2.a);
		
		obj2 = obj2.incrByten();
		System.out.println("obj2.a"+obj2.a);
		

	}
}