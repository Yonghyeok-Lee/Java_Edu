import java.util.*;

public class baekjoonTenTwo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int third = a * (b % 10);
		int fourth = a * ((b / 10) % 10);
		int fifth = a * (b / 100);
		int sixth = third + (fourth*10) + (fifth*100);
		System.out.println(third + "\n" + fourth + "\n" + fifth + "\n" + sixth);
	}
}
