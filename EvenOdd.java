import java.util.Scanner;
class EvenOdd
{
public static void main(String  []args)
{
int i;
Scanner in=new Scanner(System.in);
System.out.print("enter the number:");
i=in.nextInt();
if(i%2==0)
System.out.print("the number is even number");
else
System.out.print("the number is odd number");
}
}