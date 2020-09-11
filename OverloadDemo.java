

public class OverloadDemo {
	void multi() {
		System.out.println("no value to multiply");
	}
	void multi(int a) {
		System.out.println("a*a:"+a*a);
	}
	void multi(int a,int b) {
		System.out.println("a*b:"+a*b);
	}
	double multi(double a) {
		return a*a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadDemo ob=new OverloadDemo();
		double result;
		ob.multi();
		ob.multi(10);
		ob.multi(10,20);
		System.out.println("result of ob.multi(123.5): "+ob.multi(123.5));

	}

}
