import java.util.Scanner;
class Reverseeg

{
   public static void main(String[]args)
      {
	System.out.println("enter a string:");
	Scanner k=new Scanner(System.in);
	String str=k.nextLine();
	for(int i=str.length()-1;i>=0;i--)
	{
	  char ch=str.charAt(i);
	  System.out.print(ch);
        }
    }
  }