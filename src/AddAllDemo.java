import java.util.ArrayList;

public class AddAllDemo {

	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Jin");
		al1.add("Yoongi");
		al1.add("Hoseok");
		al1.add("Namjoon");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Jimin");
		al2.add("Tae Hyung");
		al2.add("Jungkook");
		al1.addAll(al2);
		System.out.println(al1);

	}

}
