
public class Task3 {

	public static void main(String[] args) {
		int a = 1;
		String str = "Hello world!";
		StringBuilder builder = new StringBuilder();
		if (a == 0) {
			System.out.println(str.replaceAll("l", ""));
		}
		if (a == 1) {
			int number = 2;
			String s = "l";
			builder = new StringBuilder(str);
			for (int i = number; i < str.length(); i = i + number + s.length()) {
				builder.insert(i, s);
			}
		}
		System.out.println(builder);
	}
}