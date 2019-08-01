import java.util.*;
import java.io.*;

public class bk4_3
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try{
			int test = Integer.parseInt(br.readLine());
			int count = 1;
			
			StringTokenizer st = new StringTokenizer(Integer.toString(test));
			int getIt = Integer.parseInt(st.nextToken());
			
			while (0<=test && test<=99){
				int a = getIt / 10;
				int b = getIt % 10;
				int c = a + b;
				int d = b*10 + c%10;
				
				if (d != test){
					getIt = d;
					count += 1;
				}
				else {
					break;
				}
			}
			bw.write(count + "\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
