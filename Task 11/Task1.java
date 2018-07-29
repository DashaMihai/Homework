
public class Task1 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello world!");
		int number = 2;
		String s = str.substring(0, 5);
		for (int i = number; i < str.length(); i = i + number + s.length()) {
			str.insert(i, s);
		}
		System.out.println(str);
	}

}
