package studypedia;
import java.util.Scanner;
public class Simpleinterst {

	public static void main(String[] args) {
		//double pr,rate,t,sim,com;
		System.out.println("Enter the amount");
		pr=sc.nextDouble();
		System.out.println("Enter the no of years");
		t=sc.nextDouble();
		System.out.println("Enter the rate of interst");
		Rate=sc.nextDouble();
		sim=(pr*t*rate)/100;
		com=pr*Math.pow(1.0+rate/100.0,t)-pr;
		System.out.println("simple interst="+sim);
		System.out.println("compound interst="+com);
	}
	}