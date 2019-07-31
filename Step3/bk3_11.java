import java.util.*;
import java.io.*;

public class bk3_11
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		String[] list = br.readLine();
		
		try{
			if (1<=b && b<=10000 && 1<=c && c<=10000){
			
				for (int i = 0; i < list.size(); i++){
					String result = list.get(i);
					if (result > b){
						list.remove(result);
					}
					else {
						
					}
				}
					bw.write("\n");
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
