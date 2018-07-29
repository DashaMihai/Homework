
public class Task2 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello world!");
		String s = str.substring(0, 5);
		String word = " dear";
		System.out.println(str.insert(s.length(), word));
	}

}
