import java.util.*;
import java.io.*;

public class bk5_7
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int count = 0;
		int result = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			int len = Integer.parseInt(st.nextToken());
			int results[] = new int[len];

			for (int i = 0; i < len; i++){
				StringTokenizer str = new StringTokenizer(br.readLine());
				String getIt = str.nextToken();				
				
				for (int j = 0; j < getIt.length(); j++){
					char b = getIt.charAt(j);
					
					if (b == 'o'){
						count += 1;
						result += count;
					}
					else {
						count = 0;
					}
				}
				results[i] = result;
				count = 0;
				result = 0;
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
