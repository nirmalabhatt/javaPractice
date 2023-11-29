import java.util.Scanner;
class giveinput
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int x=sc.nextInt();
System.out.println("the x="+x);
System.out.println("enter second number");
float y=sc.nextFloat();
System.out.println("the y="+y);
float z=x+y;
System.out.println("the sum="+z);
}
}