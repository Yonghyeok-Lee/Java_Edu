import java.util.*;
import java.io.*;

public class bk7_5
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int alpha[] = new int[26];
		int MAX = 0;
		int excep = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			char[] result = (st.nextToken()).toCharArray();
			
			for (int i = 0; i < result.length; i++){
				
				if ((int)result[i]>=65 && (int)result[i]<=90){
					alpha[(int)result[i]-65]++;
				}
				if ((int)result[i]>=97 && (int)result[i]<=122){
					alpha[(int)result[i]-97]++;
				}
			}
			
			for (int i = 0; i < alpha.length; i++){
				
				for (int j = i+1; j < alpha.length; j++){
					
					if (alpha[i]>0 && alpha[i] == alpha[j]){
						excep = 1;
					}
				}
				
				if (alpha[i] > MAX){
					MAX = alpha[i];
				}
			}
			
			if (excep != 0){
				bw.write("?");
			}
			else {
				for (int i = 0; i < alpha.length; i++){
					
					if (alpha[i] == MAX){
						bw.write((char)i+65);
					}
				}
				
			}
			bw.write("\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
