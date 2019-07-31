import java.util.*;

public class bk3_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		if (1<=a && a<=9){
			for (int i = 1; i < 10; i++){
				int b = a * i;
				System.out.println(a + " * " + i + " = " + b);
			}
		}
	}
}
