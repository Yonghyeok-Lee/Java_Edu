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
		float count = 0;
		float result = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			int len = Integer.parseInt(st.nextToken());
			
			
			int getIt[] = new int[len];
			float results[] = new float[len];

			for (int i = 0; i < len; i++){
				StringTokenizer str = new StringTokenizer(br.readLine());
				int stand = Integer.parseInt(str.nextToken());

				int getThat[] = new int[stand];
				
				for (int j = 0; j < stand; j++){
					getThat[j] = Integer.parseInt(str.nextToken());
					sum += getThat[j];
					avg = sum / stand;
				}
				
				for (int j = 0; j < stand; j++){
					
					if (getThat[j] > avg){
						count += 1;
					}
				}
				result = count * 100 / stand;
				results[i] = result;
				sum = 0;
				avg = 0;
				count = 0;
			}
			
			for (int i = 0; i < results.length; i++){
				bw.write(results[i] + "\n");
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
