import java.util.Scanner;


class IntObj
{
    public int value;
}
public class JavaProgram
{
   public static void main(String args[])
   {
       int num1, num2, sum=0;
       IntObj ptr1;
       IntObj ptr2;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Two Number : ");
       num1 = scan.nextInt();
       num2 = scan.nextInt();
	   
       ptr1 = new IntObj();
       ptr2 = new IntObj();
       ptr1.value = num1;
       ptr2.value = num2;
	   
       sum = ptr1.value + ptr2.value;
	   
       System.out.print("Sum of the Two Number is " +sum);
   }
}
