
public class ObjDemo {
	int a;
	public static void main(String[] args) {
		
		ObjDemo o1,o2;
		o1=new ObjDemo();
		o2=new ObjDemo();
		o1.a=100;
		o2.a=100;
		if(o1==o2) {
			System.out.println("Both are equal");
		}
		else
			System.out.println("Both are not equal");
		o2=o1;
		if(o1==o2) {
			System.out.println("Both are equal");
		}
		else
			System.out.println("Both are not equal");
	}

}
