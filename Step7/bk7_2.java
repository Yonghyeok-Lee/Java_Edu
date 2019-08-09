import java.util.*;
import java.io.*;

public class bk7_2
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int sum = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			int len = Integer.parseInt(st.nextToken());
			
			String x = br.readLine();
			
			if (x.length() == len){
				StringTokenizer str = new StringTokenizer(x);
				String y = str.nextToken();

					for (int j = y.length(); j > 0; j--){
						sum += Integer.parseInt(y.substring(j-1, j));
					}
				bw.write(sum + "\n");
			}
			else {
				throw new Exception();
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
