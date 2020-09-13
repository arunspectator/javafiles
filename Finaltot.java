
class Stu    //base class
{
	private int sno;
	private String sname;
	void setstud(int no,String name)
	{
		sno=no;
		sname=name;
	}
	public void putstud()
	{
		System.out.println("sno= "+sno);
		System.out.println("Student Name:" +sname);
	}
}
class marks extends Stu //derived or intermediate base class
{
	protected int mark1,mark2;
	public void setmarks(int m1,int m2)
	{
		mark1=m1;
		mark2=m2;
	}
	public void putmarks()
	{
		System.out.println("Mark1:" +mark1);
		System.out.println("Mark2:" +mark2);
	}
}
class finaltot extends marks // derived class
{
	private int total;
	public void calc()
	{
		total=mark1+mark2;
	}
	public void puttotal()
	{
		System.out.println("Total: " +total);
	}
	public static void main(String args[])
	{
		finaltot f=new finaltot();
		f.setstud(100,"ABC");
		f.setmarks(78,89);
		f.calc();
		f.putstud();
		f.putmarks();
		f.puttotal();
	}
}