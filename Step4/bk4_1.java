import java.util.*;
import java.io.*;

public class bk4_1
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try{
			while (true){
				StringTokenizer st = new StringTokenizer(br.readLine());
			
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				int c = a + b;
				
				if (a == 0 && b ==0){
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
