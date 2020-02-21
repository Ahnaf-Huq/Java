class A{ 
	public A() { 
		n = 0; 
		System.out.println("Constructor without parameters: "+n);
	}
	public A(int a) {
		n = a;
		System.out.println("Constructor with parameter: "+n);
	}
	public void f() {
		n++; 
		System.out.println("Method f called(increased by 1): "+n);
	}
	public void g() { 
		System.out.println("Method g called");
		f(); 
		n = 2 * n; 
		f();
		System.out.println("Method g result: "+n);
	}
	public int h() { 
		return n; 
	}
	public void k() { 
		System.out.println("Method k called: "+n);
	}
	private int n;
}

class Aa {
	public static void main(String[] args) {
		A a = new A();
		A b = new A(2);
		A c = b;
		A d = new A(3);
		a.f(); 
		b.g(); 
		c.f(); 
		d.g(); 
		d.k(); 
		A e = new A(a.h()+ b.h()+ c.h());
		
	}
}
