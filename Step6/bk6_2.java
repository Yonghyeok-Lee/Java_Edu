import java.util.*;
import java.io.*;

public class bk6_2
{
	static int[] Kaprekar()
	{
		int getIt[] = new int[10];
		int no = 0;
		
		for (int i  = 0; i < 10; i++){
			
			if (i < 10){
				no = i + i;
				getIt[i] = no;
			}
			if (i >= 10 && i < 20){
				no = no + (i/10) + (i%10);
				getIt[i] = no;
			}
			System.out.println(getIt[i]);
/*			if (i >= 100 && i < 1000){
				i = (i/100) + ((i%100)/10) + (i%10);
				getIt[i] = i;
			}
			if (i >= 1000 && i < 10000){
				i = (i/1000) + ((i%1000)/100) + (((i%1000)%100)/10) + (i%10);
				getIt[i] = i;
			}*/
			
		}
		return getIt;
	}
	
	public static void main(String args[])
	{
		int coke[] = Kaprekar();
		int pepsi[] = new int[10000];
		for (int i  = 0; i < coke.length; i++){
			if (i+1 != coke[i]){
				pepsi[i] = i+1;
				System.out.println(pepsi[i]);
			}
		}
	}
}
