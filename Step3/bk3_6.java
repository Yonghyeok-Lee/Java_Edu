import java.util.*;
import java.io.*;

public class bk3_6
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		try{
			if (a <= 1000000){
			
				for (int i = a; i >= 1; i--){
					bw.write(i + "\n");
				}
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
