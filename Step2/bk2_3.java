import java.util.*;

public class bk2_3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		if (1<=a && a <=4000){
			if (a%4 == 0){
				int b = a%100 != 0 || a%400 == 0 ? 1 : 0;
				System.out.println(b);
			}
		}	
	}
}
