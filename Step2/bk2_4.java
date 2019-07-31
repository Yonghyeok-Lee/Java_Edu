import java.util.*;

public class bk2_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();
		
		if (0<=H && H <=23){
			if (0<=M && M <=59){
				if (M >= 45) {
					int result = M - 45;
					System.out.println(H + " " + result);
				}
				else {
					int result = 60 - 45 + M;
					int resultH = --H;
					System.out.println(resultH + " " + result);
				}
			}
		}	
	}
}
