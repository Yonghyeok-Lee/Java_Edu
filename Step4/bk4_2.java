import java.util.*;
import java.io.*;

public class bk4_2
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try{

			while (true){
				String test = br.readLine();
				StringTokenizer st = new StringTokenizer(test);
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = a + b;
				
				if (test == null){
					break;
				}
				
				bw.write(c + "\n");
			}		
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
