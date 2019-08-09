import java.util.*;
import java.io.*;

public class bk7_3
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int alpha[] = new int[127];
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			char[] result = (st.nextToken()).toCharArray();
			
			for (int i = 0; i < alpha.length; i++){
				alpha[i] = -1;
			}
			
			for (int i = 0; i < result.length; i++){
				
				if ((int)result[i] >= 97 && (int)result[i] <= 122){
					
					if (i >1 && (int)result[i-1] != (int)result[i]){
						alpha[(int)result[i]] = i;
					}
				}
				else {
					throw new Exception();
				}
				
			}
			
			for (int i = 97; i < 122; i++){
				bw.write(alpha[i] + " ");
			}
			bw.write("\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
