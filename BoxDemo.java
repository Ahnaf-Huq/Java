class Box
{
	double width,height,depth;
}
public class BoxDemo
{
	public static void main(String args[])
	{
		Box mybox = new Box();
		mybox.width = 10;
		mybox.height = 12;
		mybox.depth = 14;
		
		double volume = mybox.width*mybox.height*mybox.depth;
		System.out.println("Volume of the box: "+volume);
		
		Box box2;
		box2 = new Box();
		box2.width = 10;
		box2.height = 12;
		box2.depth = 14;
		
		volume = box2.width*box2.height*box2.depth;
		System.out.println("Volume of the box: "+volume);
		
		Box box3;
		box3 = box2;
		System.out.println(box2 == box3); 
		System.out.println(box2 == mybox); 
		
		box2 = null;
		System.out.println(box3.width);
		//System.out.println(box2.width);
		
	}
	
}
	