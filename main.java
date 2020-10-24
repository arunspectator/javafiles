import java.util.*;
class Salarydetails{
	public int hra,da,ma,it;
	public int basicsalary,hrapercent,dapercent,mapercent,itpercent;
	int gross,netsalary;

	 public void getsalary(){
	 	Scanner scan =new Scanner(System.in);
	 	System.out.println("ENTER BASIC SALARY");
	 	basicsalary=scan.nextInt();
	 	System.out.println("ENTER HRA PERCENTAGE");
	 	hrapercent=scan.nextInt();
	 	System.out.println("ENTER DA PERCENT");
	 	dapercent=scan.nextInt();
	 	System.out.println("ENTER MAPERCENT");
	 	mapercent=scan.nextInt();
	 	if(basicsalary<50000){
	 		itpercent=5;
	 	}
	 	else if(basicsalary<100000 && basicsalary>50000) {
	 	    itpercent=10;
	 	}
	 	else{
	 		itpercent=15;
	 	}
	 
	 	hra=(hrapercent/100)*basicsalary;
	 	da=(dapercent/100)*basicsalary;
	 	ma=(mapercent/100)*basicsalary;
	 	gross=basicsalary+hra+da+ma;
	 	it=(itpercent/100)*gross;
	 	netsalary=gross-it;
	 }
	 
	 public void display(){

	 		 System.out.println("basicsalary:"+basicsalary);
	 		 System.out.println("HRA:"+hra);
	 		 System.out.println("DA:"+da);
	 		 System.out.println("MA:"+ma);
	 		 System.out.println("grosssalary"+gross);
	 		 System.out.println("it:"+it);
	 		 System.out.println("netsalary:"+netsalary);


	 }
	}

class main{
	public static void main(String[] args) {
	Salarydetails a = new Salarydetails();
	a.getsalary();
	a.display();
 }
}