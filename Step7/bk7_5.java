import java.util.*;
import java.io.*;

public class bk7_5
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int alpha[] = new int[127];
		int MAX = 0;
		int excep = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			char[] result = (st.nextToken()).toCharArray();
			
			for (int i = 0; i < result.length; i++){
				
				if ((int)result[i] >= 65 && (int)result[i] <= 90){
					alpha[(int)result[i]]++;
				}
				if ((int)result[i] >= 97 && (int)result[i] <= 122){
					alpha[(int)result[i]]++;
				}
			}
			
			for (int i = 0; i < alpha.length; i++){
				if (MAX < alpha[i]){
					System.out.println(alpha[i] + " : " + MAX);
					MAX = i;
					System.out.println(MAX);
				}
			}
			System.out.println(alpha[97] + " : " + MAX);
			System.out.println(alpha[98] + " : " + MAX);
			if (excep != 0){
				bw.write("?");
			}
			else {
				bw.write((char)MAX);
			}
			bw.write("\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
