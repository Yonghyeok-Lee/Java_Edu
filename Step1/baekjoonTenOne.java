import java.util.*;

public class baekjoonTenOne
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (2<=a && a<=10000 && 2<=b && b<=10000 && 2<=c && c<=10000) {
			int d = (a + b) % c;
			int e = (a%c + b%c) % c;
			int f = (a * b) % c;
			int g = (a%c * b%c) % c;
			
			System.out.println(d + "\n" + e + "\n" + f + "\n" + g);
			
			boolean hi = d == e ? true : false;
			System.out.println(hi);
			boolean bye = f == g ? true : false;
			System.out.println(bye);
		}
		else {
			System.out.println("plz 2 <= A, B, C <= 10,000");
		}
	}
}
