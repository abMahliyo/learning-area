package Day09;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		System.out.println(fac(n));
		
	}
	
	private static int fac(int n) {
		if (n== 1) return 1;
		return fac(n-1) * n;
		
	}

}
