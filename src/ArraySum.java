
public class ArraySum {

	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		int s=0,n=0,avg=0;
		for(int i:nums) {
			s+=i;
			n+=1;
			
		}
		avg=(s/n);
		System.out.println("average= "+avg);
		

	}

}
