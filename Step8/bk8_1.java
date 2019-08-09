import java.util.*;
import java.io.*;

public class bk8_1
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String sel = br.readLine();
		int count = 1;
		
		try{
			StringTokenizer st = new StringTokenizer(sel);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			while (true){
				
				if (a+(b*count) < (c*count)){
					bw.write(count + "\n");
					break;
				}
				count++;
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
