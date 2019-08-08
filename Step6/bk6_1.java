import java.util.*;
import java.io.*;

public class bk6_1
{
	long sum(int[] a)
	{
		long ans = 0;
		
		for(int i  = 0; i < a.length; i++){
			ans += a[i];
		}
		return ans;
	}
}
