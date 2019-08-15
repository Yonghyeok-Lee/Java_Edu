import java.util.*;
import java.io.*;

public class bk8_3
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

            for (int x = 0; x <= a/5; x++){
                for (int y = 0; y <= a/3; y++){
                    if(5*x+3*y==a){
                        result = x+y;
                    }
                }
            }

            bw.write(result + "\n");
        }catch(Exception e){
            bw.write("So sad.." + "\n" + e + "\n");
        }
        bw.flush();
    }
}
