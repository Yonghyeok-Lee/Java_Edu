import java.util.*;
import java.io.*;

public class bk8_2
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sel = br.readLine();
		int five = 0;
		int three = 0;
		int result = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(sel);
			int a = Integer.parseInt(st.nextToken());
			
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
