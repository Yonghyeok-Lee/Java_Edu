import java.util.*;
import java.io.*;

public class bk7_7
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			String b = st.nextToken();
			String c = st.nextToken();
			
			String sub = "";
			String ssub = "";
			
			if (b.length() != c.length()){
				
				if (b.length() > c.length()){
					for (int i = 0; i < b.length(); i++){
						sub += b.substring((b.length()-i)-1, b.length()-i);
					}
					bw.write(sub + "\n");
				}
				if (b.length() < c.length()){
					for (int i = 0; i < c.length(); i++){
						ssub += c.substring((c.length()-i)-1, c.length()-i);
					}
					bw.write(ssub + "\n");
				}
			}
			else {
				for (int i = 0; i < b.length(); i++){
					sub += b.substring((b.length()-i)-1, b.length()-i);
				}
			
				for (int i = 0; i < c.length(); i++){
					ssub += c.substring((c.length()-i)-1, c.length()-i);
				}
				
				if (Integer.parseInt(sub) > Integer.parseInt(ssub)){
					bw.write(sub + "\n");
				}
				else if (Integer.parseInt(sub) < Integer.parseInt(ssub)){
					bw.write(ssub + "\n");
				}
				else {
					bw.write("same" + "\n");
				}
			}
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
