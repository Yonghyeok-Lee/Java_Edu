import java.util.*;
import java.io.*;

public class bk5_8
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int sum = 0;
		float avg = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			int len = Integer.parseInt(st.nextToken());
			int getIt[] = new int[1000];

			for (int i = 0; i < len; i++){
				StringTokenizer str = new StringTokenizer(br.readLine());
				int count = Integer.parseInt(str.nextToken());
				
				getIt[i] =count;
				
				System.out.println(count + " : " + getIt[i]);
				
				for (int j = 0; j < getIt[0]-1; j++){
					sum += getIt[j];
				}
				avg = sum / getIt[0];
			}
			bw.write(avg + "\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
