import java.util.*;
import java.io.*;

public class bk7_10
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			String b = st.nextToken();
			bw.write(b + "\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
