import java.util.Scanner;
 public class TaxAmount {
	 public static void main(String[] args) {
		int ctc;
		double tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ctc");
		ctc=sc.nextInt();
		if(ctc<=180000)
		{
		tax=0;	
		System.out.println("slab A's"+tax+"is the display TaxAmount");
		}
		else if((ctc>=181001)&&(ctc<=300000))
	{
		tax=(ctc/100)*10;
		System.out.println("slab B's"+tax+"is the display TaxAmount");
 }
	else if((ctc>=300001)&&(ctc<=500000))
	{
	    tax=(ctc/100)*20;
	    System.out.println("slab C's"+tax+"is the display TaxAmount");
	}
	else if((ctc>=500001)&&(ctc<=100000))
	{
	    tax = (ctc/100)*30;
	    System.out.println("slab D's"+ tax +"is the display TaxAmount");
	}
	else
	{
		System.out.println("Wrong input");
	}
	 }
 }

