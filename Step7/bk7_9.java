import java.util.*;
import java.io.*;

public class bk7_9
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int count = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			char[] b = (st.nextToken()).toCharArray();
			
			for (int i = 0; i < b.length; i++){
				count++;
	
				if (b[i] == 'c'){
					if (b[i+1] == '='){
						count--;
					}
					if (b[i+1] == '-'){
						count--;
					}
				}
				if (b[i] == 'd'){
					if (b[i+1] == 'z'){
						if (b[i+2] == '='){
							count--;
						}
					}
					if (b[i+1] == '-'){
						count--;
					}
				}
				if (b[i] == 'l'){
					if (b[i+1] == 'j'){
						count--;
					}
				}
				if (b[i] == 'n'){
					if (b[i+1] == 'j'){
						count--;
					}
				}
				if (b[i] == 's'){
					if (b[i+1] == '='){
						count--;
					}
				}
				if (b[i] == 'z'){
					if (b[i+1] == '='){
						count--;
					}
				}
			}
			bw.write(count + "\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}
