package studypedia;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Marks of Subject 1:");
		int marks1=sc.nextInt();
		System.out.println("Enter your Marks of Subject 2:");
		int marks2=sc.nextInt();
		System.out.println("Enter your Marks of Subject 3:");
		int marks3=sc.nextInt();
		if(( marks1>60)&&(marks2>60)&&(marks3>60)) {
			System.out.println("Passed");
		}
		else if(((marks1>60)&&(marks2>60))||((marks2>60)&&(marks3>60))||((marks1>60)&&(marks3>60)))
		{
			System.out.println("Promoted");
		}
		else if((marks1>60)||(marks2>60)||(marks3>60))
		{
			System.out.println("Failed");
		}
		else 
		{
			System.out.println("Failed");
		}

	}

}
