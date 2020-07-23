import java.util.Arrays;

public class ArraySort3 {
	public static void main(String[] args) {
	String[] names= {"Jin","Yoongi","Hoseok","Namjoon",null,"Jimin","TaeHyung","Jungkook","Devu"};
	System.out.println("Before sorting");
	for(String name:names)
		System.out.println(name);
	Arrays.sort(names);
	System.out.println("After Sorting");
	for(String name:names)
		System.out.println(name);
	
	
}

}
