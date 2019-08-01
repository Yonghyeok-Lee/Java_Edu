import java.util.*;
import java.io.*;

public class bk3_11
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine();
		int getIt;

		try{
			StringTokenizer st = new StringTokenizer(a, " ");
			
			int len = Integer.parseInt(st.nextToken());
			int stan = Integer.parseInt(st.nextToken());
			
			StringTokenizer str = new StringTokenizer(br.readLine());

			for (int i = 0; i < len; i++){
				getIt = Integer.parseInt(str.nextToken());
				
				if (getIt < stan){
					bw.write(getIt + " ");
				}
			}
			bw.write("\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
