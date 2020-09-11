

class Box{
	int width;
	int height;
	int depth;
	int vol;
}
class BoxDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox=new Box();
		
		mybox.width=10;
		mybox.height=20;
		mybox.depth=15;
		mybox.vol=mybox.width+mybox.height+mybox.depth;
		System.out.println("Volume is "+mybox.vol);

	}

}



