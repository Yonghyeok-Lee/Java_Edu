import java.util.*;
import java.io.*;

public class bk7_4
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try{
			String test = br.readLine();
			StringTokenizer st = new StringTokenizer(test);
			
			while (st.hasMoreTokens()){	
				int a = Integer.parseInt(st.nextToken());
				String d = "";
				
				if (st.hasMoreTokens()){
					String b = st.nextToken();
					
					for (int i = 0; i < b.length(); i++){
						String c = b.substring(i, i+1);
					
						for (int j = 0; j < a; j++){
							d += c;
						}
					}
				
					test = br.readLine();
					st = new StringTokenizer(test);
				}
				else {
					test = br.readLine();
					st = new StringTokenizer(test);
				}
				bw.write(d + "\n");
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
