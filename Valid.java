package Logic;

import java.util.Scanner;

public class Valid {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   int a=s.nextInt();
	if(a>0&&a<9)
	{
	
		System.out.print("valid data");
	}
	else
	System.out.println("enter a valid data");
   s.close();
   
	}

}
