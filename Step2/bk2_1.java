import java.util.*;

public class bk2_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(-10000<=a && a <=10000 && -10000<=b && b <=10000){
			if (a>b){
				System.out.println(">");
			}
			else if (a<b){
				System.out.println("<");
			}
			else if (a==b){
				System.out.println("==");
			}
		}
	}
}
