import java.util.*;
import java.io.*;

public class bk5_3
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String results = "";

		try{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int getIt[] = new int[8];
			
			for (int i = 0; i < 8; i++){
				getIt[i] = Integer.parseInt(st.nextToken());

				while (st.hasMoreTokens()){
					if (getIt[i] == i+1){
						results = "ascending";
						break;
					}
					else if (getIt[i] == 8-i){
						results = "descending";
						break;
					}
					else {
						results = "mixed";
						break;
					}
				}
			}
			bw.write(results +  "\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
