package Logic;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int sum=0;
        float avg=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
        int b=s.nextInt();
        int a[]=new int[b];
        System.out.println("Enter the array: ");
        for(int i=0;i<b;i++)
        {
        a[i]=s.nextInt();
        	sum=sum+a[i];
        }
        avg=sum/b;
        System.out.println("the average is: "+avg);
        s.close();
	}


}
