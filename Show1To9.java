package Logic;

import java.util.Scanner;

public class Show1To9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>0&&a<9)
		{
		
			System.out.print(a);
		}
		else
		System.out.println("you entered number is not in the range");
        s.close();
	}

}
