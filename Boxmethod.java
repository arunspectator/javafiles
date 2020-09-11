

class cube{
	double width;
	double height;
	double depth;
	double volume() {
		return width*height*depth;
	}
}
public class Boxmethod {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		cube mybox1=new cube();
		cube mybox2=new cube();
		double vol;
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=15;
		mybox2.width=3;
		mybox2.height=6;
		mybox2.depth=9;
		vol=mybox1.volume();
		System.out.println("the volume is"+vol+" of the mybox 1");
		vol=mybox2.volume();
		System.out.print("Volume is "+vol);

	}

}
