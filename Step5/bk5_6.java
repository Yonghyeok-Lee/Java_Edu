import java.util.*;
import java.io.*;

public class bk5_6
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		float avg = 0;
		int Max = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			int len = Integer.parseInt(st.nextToken());
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			
			if (1<=len && len<=1000){
				int getIt[] = new int[len];
				for (int i = 0; i < len; i++){
					getIt[i] = Integer.parseInt(str.nextToken());
					
					if (getIt[i] > Max){
						Max = getIt[i];
					}
					
					avg += getIt[i];
				}
				avg = avg / len;
				float result = avg / Max * 100;
				
				bw.write(result + "\n");
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
