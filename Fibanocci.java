package Logic;
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=0,c=1;
		int d;
		s.close();
		System.out.print(b+" ");
		System.out.print(c+" ");
		for(int i=2;i<a;i++)
		{
			d=b+c;
			b=c;
			c=d;
			System.out.print(d+" ");
		}
      
	}

}
