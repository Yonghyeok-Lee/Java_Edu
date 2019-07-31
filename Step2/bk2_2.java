import java.util.*;

public class bk2_2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		if(0<=a && a <=100){
			if (90<= a && a<=100){
				System.out.println("A");
			}
			else if (80<= a && a<=89){
				System.out.println("B");
			}
			else if (70<= a && a<=79){
				System.out.println("C");
			}
			else if (60<= a && a<=69){
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}
		}	
	}
}
