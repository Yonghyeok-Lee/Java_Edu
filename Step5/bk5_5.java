import java.util.*;
import java.io.*;

public class bk5_5
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int support = 42;
		int count = 0;
		int star = 0;
		
		try{
			int getIt[] = new int[10];
			int cute[] = new int[10];
			int results[] = new int[10];
			
			for (int i = 0; i < 10; i++){
				StringTokenizer st = new StringTokenizer(br.readLine());
				getIt[i] = Integer.parseInt(st.nextToken());
				cute[i] = getIt[i] % support;
			}

			// 문제
			for (int i = 0; i < cute.length; i++){
				
				for (int j = 0; j < cute.length; j++){
					
					if (cute[i] == cute[j]) {
						
						for (int k = 0; k < results.length; k++) {
							
							if (cute[i] != results[k]){
								results[i] = cute[i];
								System.out.println("results : " + results[k] + " ,cute : " + cute[i]);
							}
						}
					}
				}
			}
			
			for (int i = 0; i < results.length; i++){
				count += 1;
			}
			bw.write(count + "\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
