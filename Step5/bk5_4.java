import java.util.*;
import java.io.*;

public class bk5_4
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int support = 1;
		String[] result;

		try{
			int getIt[] = new int[3];
			
			for (int i = 0; i < 3; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				getIt[i] = Integer.parseInt(st.nextToken());
				support = support * getIt[i];
			}
			result = Integer.toString(support).split("");
			
			int count [] = new int[10];
			for (int i = 0; i < result.length; i++){
				for (int j = 0; j < count.length; j++){
					if (Integer.parseInt(result[i]) == j){
						count[j]++;
					}
				}					
			}
			
			for (int i = 0; i < count.length; i++){
				bw.write(count[i] + "\n");
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
