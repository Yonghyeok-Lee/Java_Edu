import java.util.*;
import java.io.*;

public class bk3_8
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		try{
			if (a < 1000000){
				int b ,c, e;
			
				for (int i = 1; i <= a; i++){
					StringTokenizer st = new StringTokenizer(br.readLine());
			
					b = Integer.parseInt(st.nextToken());
					c = Integer.parseInt(st.nextToken());
					e = b + c;
			
					bw.write("Case #" + i + ": " + b + " + " + c + " = " + e + "\n");
				}
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
