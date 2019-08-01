import java.util.*;
import java.io.*;

public class bk5_2
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int Max = 0;
		int count = 0;

		try{
			int getIt[] = new int[9];
			
			for (int i = 0; i < getIt.length; i++){
				int len = Integer.parseInt(br.readLine());
				StringTokenizer st = new StringTokenizer(Integer.toString(len));
				
				getIt[i] = Integer.parseInt(st.nextToken());
					
				if (getIt[i] > Max){
					Max = getIt[i];
					count = i + 1;
				}
			}
			bw.write(Max + "\n" + count + "\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
