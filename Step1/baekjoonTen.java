import java.util.*;

public class baekjoonTen
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (1<=a && b<=10000) {
			int add = a + b;
			int sub = a - b;
			int mul = a * b;
			int mod = a / b;
			int rem = a % b;
			System.out.println(add + "\n" + sub + "\n" + mul + "\n" + mod + "\n" + rem);
		}
		else {
			System.out.println("plz 0 < A and B <10");
		}
	}
}
