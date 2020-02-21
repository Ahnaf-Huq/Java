class Box
{
	private String name;
	private double width,height,depth;
	private Box()
	{
		width =height=depth = -1;
		
	}
	public Box(String name,double width,double height,double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.name = name; //this always refers to the current object not to current class
	}
	public Box(String name)
	{
		this();		//calling default constructor
		this.name = name;
	}
	public Box(int length){
		this("Cube",length,length,length);		//calling constructor
	}
	public double volume()
	{
		this();
		return width*height*depth;
	}
	public void printVolume()
	{
		System.out.println(name);
		System.out.println("Volume print by volume method: "+volume());
		
	}
}
public class BoxDemo10
{
	public static void main(String args[])
	{
		Box box1 = new Box("Box1",10,12,15);
		
		Box box2;
		box2 = new Box("Box2",5,6,7);
		
		box1.printVolume();
		
		
		//System.out.println("Volume of the box: "+box1.volume());
		//System.out.println("Volume of the box: "+box2.volume());
		
		//Box box3 = new Box();
		//System.out.println("Volume of the box: "+box3.volume());
		Box box4 = new Box("Box 4");
		box4.printVolume();
		
	}
	
}
	