import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p=0;
		for(int i=0;i<n;i++)
		{
			int a =s.nextInt();
			if(a!=p)
				System.out.print(a+" ");
			p=a;
		}
		s.close();
	}

}
