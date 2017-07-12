package Logic;

import java.util.Scanner;

public class MultTable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b;
	    for(int i=1;i<=20;i++)
	    {
	    	System.out.println(i+" * "+a+" = "+(i*a));
	    }

	}

}
