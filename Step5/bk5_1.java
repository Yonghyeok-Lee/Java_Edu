import java.util.*;
import java.io.*;

public class bk5_1
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine();
		int Max = 0;
		int Min = 0;

		try{
			StringTokenizer st = new StringTokenizer(a);
			
			int len = Integer.parseInt(st.nextToken());
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			if (1<=len && len<=1000000){
				int getIt[] = new int[len];
				for (int i = 0; i < len; i++){
					getIt[i] = Integer.parseInt(str.nextToken());
					
					if (i == 0){
						Max = getIt[0];
						Min = getIt[0];
					}
					else {
						if (getIt[i] > Max){
							Max = getIt[i];
						}
						if (getIt[i] < Min){
							Min = getIt[i];
						}
					}
				}
				bw.write(Min + " " + Max + "\n");
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
