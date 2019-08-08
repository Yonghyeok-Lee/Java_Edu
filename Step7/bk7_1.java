import java.util.*;
import java.io.*;

public class bk7_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String x = br.readLine();
		StringTokenizer st = new StringTokenizer(x);
		char result = (st.nextToken()).charAt(0);

        bw.write((int)result + "\n");
		bw.flush();
	}
}
