import java.util.*;
import java.io.*;

public class bk3_10
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		try{
			if (1<=a && a<=100){
			
				for (int i = 1; i <= a; i++){
					for (int j = a; j >= 1; j--){
						if (i < j){
							bw.write(" ");
						}
						else {
							bw.write("*");
						}
					}
					bw.write("\n");
				}
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
