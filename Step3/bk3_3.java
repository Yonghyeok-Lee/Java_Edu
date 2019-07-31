import java.util.*;

public class bk3_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = 0;
		
		if (1<=a && a<=10000){
			for (int i = 1; i <= a; i++){
				b += i;
				
				if (i == a){
					System.out.println(b);
				}
			}
		}
	}
}
