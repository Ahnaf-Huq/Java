class Stack
{
	private int stck[] = new int [10];
	private int tos;
	
	Stack(){
		tos = -1;
	}
	void push(int item){
		if(tos == 9){
			System.out.println("Stack is full.");
		} else{
			stck[++tos] = item;
		}	
	}
	int pop(){
		if (tos < 0){
			System.out.println("Stack is empty.End of stack");
			return 0;
		} else{
			return stck[--tos];
		}
	}
}


class AccessModStack
{
	public static void main(String args[])
	{
		int i;
		Stack mystack1 = new Stack();  //Creating objects "pushing" integers
		for (i=0;i<9;i++){
			System.out.println(i);
		}
		Stack mystack2 = new Stack();
		for (i=10;i<19;i++){
			System.out.println(i);
		}
		
		System.out.println("Items in Stack 01:-");
		for (i=0;i<9;i++){
			System.out.println(mystack1.pop());
		}
		
		System.out.println("Items in Stack 02:-");
		for (i=10;i<19;i++){
			System.out.println(mystack2.pop());
		}
	}

}
		