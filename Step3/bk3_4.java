import java.util.*;

public class bk3_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b ,c;
		a = sc.nextInt();
		
		StringBuffer results = new StringBuffer();
					
		for (int i = 1; i <= a; i++){
			b = sc.nextInt();
			c = sc.nextInt();
			
			if (0<b && b<10 && 0<c && c<10){
				if (i == a){
					results.append(b+c);
				}
				else{
					results.append(b+c + "\n");
				}
			}
		}
		System.out.println(results.toString());
	}
}
