package Logic;

import java.util.Scanner;

public class Greatest10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		int mx=0;
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
			mx=a[0];
			
			if(mx<a[i])
			mx=a[i];
			}
		System.out.println(mx);
	}

}
