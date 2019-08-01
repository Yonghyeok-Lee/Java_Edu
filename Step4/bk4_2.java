import java.util.*;
import java.io.*;

public class bk4_2
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();

		try{
			StringTokenizer st = new StringTokenizer(a);
			
			while (st.hasMoreTokens()){	
				int b = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int d = c + d;
				
				if (a == null){
					break;
				}
				
				bw.write(d + "\n");
			}		
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
