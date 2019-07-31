import java.util.*;

public class bk2_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (1<=a && a <=100 && 1<=b && b <=100 && 1<=c && c <=100){
			if (a > b){
				if (a > c){
					if (b > c){
						System.out.println(b);
					}
					else{
						System.out.println(c);
					}
				}
				else {
					System.out.println(a);
				}
			}
			else {
				if (b > c){
					if (a > c){
						System.out.println(a);
					}
					else{
						System.out.println(c);
					}
				}
				else {
					System.out.println(b);
				}
			}
		}	
	}
}
