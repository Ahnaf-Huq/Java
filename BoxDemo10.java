class Box
{
	private String name;
	private double width,height,depth;
	Box()
	{
		width =height=depth = -1;
		
	}
	Box(String name,double width,double height,double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.name = name;
	}
	double volume()
	{
		return width*height*depth;
	}
	void printVolume()
	{
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
		
		System.out.println("Volume of the box: "+box1.volume());
		System.out.println("Volume of the box: "+box2.volume());
		
		Box box3 = new Box();
		System.out.println("Volume of the box: "+box3.volume());

		
	}
	
}
	