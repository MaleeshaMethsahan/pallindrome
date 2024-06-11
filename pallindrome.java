import java.util.Scanner;   
public class pallindrome
{
	static void palindrome(String pal)
	{
		String pal2="";
		for(int i=pal.length()-1;i>=0;i--)
		{
			pal2 = pal2 + pal.charAt(i);
		}
		if(pal.equals(pal2))
			System.out.println("This is a palindrome");
		else
			System.out.println("This is not a palindrome");
		
	}
	
	
	
	public static void main(String args[])
	{
		System.out.print("Enter the string :");
		Scanner input= new Scanner(System.in);
		String a=input.next();
		
		String pal1 = "";
		char c ;

        for	(int i=0;i<a.length();i++)
		{
			c = a.charAt(i);
			c = Character.toUpperCase(c);
			String s=String.valueOf(c);
			pal1= pal1+s;
		}
		
		palindrome(pal1);

	}
}