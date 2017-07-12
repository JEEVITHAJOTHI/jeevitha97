package Logic;

import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int a=s.nextInt();
		System.out.println("enter the elements in the Array");
		int b[]=new int[a];
        int H=0;
        int L=0;
        for(int i=0;i<a;i++)
        {
        	b[i]=s.nextInt();
        	H=b[0];
        	
        	if(H<b[i])
        	H=b[i];}
        	for(int i=0;i<a;i++)
        	{
        	L=b[0];
        	if(L>b[i])
            L=b[i];
        }
        System.out.println(H);
        System.out.println(L);
	
}}
