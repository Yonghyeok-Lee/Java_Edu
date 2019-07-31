import java.util.*;

public class baekjoonNine
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		if (0<a && b<10) {
			System.out.println(a/b);
		}
		else {
			System.out.println("plz 0 < A and B <10");
		}
	}
}
