package Logic;
import java.util.Scanner;
public class CompareString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		if(a.equals(b))
		{
			System.out.println("SAME");
			
		}
		else
		System.out.println("NOT SAME");
	}

}
