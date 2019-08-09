import java.util.*;
import java.io.*;

public class bk7_8
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int sum = 0;
		
		try{
			StringTokenizer st = new StringTokenizer(a);
			char[] b = (st.nextToken()).toCharArray();
			
			for (int i = 0; i < b.length; i++){
				switch (b[i]){
					case 'A': case 'B': case 'C':
						sum += 3;
						break;
					case 'D': case 'E': case 'F':
						sum += 4;
						break;
					case 'G': case 'H': case 'I':
						sum += 5;
						break;
					case 'J': case 'K': case 'L':
						sum += 6;
						break;
					case 'M': case 'N': case 'O':
						sum += 7;
						break;
					case 'P': case 'Q': case 'R': case 'S':
						sum += 8;
						break;
					case 'T': case 'U': case 'V':
						sum += 9;
						break;
					case 'W': case 'X': case 'Y': case 'Z':
						sum += 10;
						break;
				}
			}
			bw.write(sum + "\n");
		}catch(Exception e){
			bw.write("So sad.." + "\n" + e + "\n");
		}
		bw.flush();
	}
}