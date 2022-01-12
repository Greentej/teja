package studypedia;
import java.util.Scanner;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int t,e,j,arr[];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter numbers of elements");
      e=sc.nextInt();
      arr=new int[e];
      System.out.println("Enter the "+e+"elements");
      for(t=0;t<e;t++)
      {
    	  arr[t]=sc.nextInt();
      }
      System.out.println("Enter the search value");
      j=sc.nextInt();
      
      for(t=0;t<e;t++)
      {
    	  if(arr[t]==j)
    	  {
    		  System.out.println(j+" is present");
    	  break;
    	  }
      }
      if(t==e)
    	  System.out.println(j+" is  not present");  
    	  }
}
