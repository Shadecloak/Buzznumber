import java.io.*;
import java.util.*;
class Buzz
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		if(num % 7 == 0)
			System.out.println("Buzz number");
		else
			System.out.println("Not a buzz number");
	}
}
