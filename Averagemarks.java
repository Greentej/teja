import java.util.Scanner;

public class Averagemarks {

	public static void main(String[] args) {
		//public static void main(String[] args) {
		//double pr,rate,t,sim,com;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		pr=sc.nextDouble();
		System.out.println("Enter the no of years");
		t=sc.nextDouble();
		System.out.println("Enter the rate of interst");
		rate=sc.nextDouble();
		sim=(pr*t*rate)/100;
		com=pr*Math.pow(1.0+rate/100.0,t)-pr;
		System.out.println("simple interst="+sim);
		System.out.println("compound interst="+com);
	}
}

