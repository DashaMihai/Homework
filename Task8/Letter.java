import java.util.Scanner;

public class Letter extends Word {

	static String str;

	@Override
	public void getInfo() {
		System.out.println("¬ведите число");
	}

	@Override
	public int scanNumber() {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			n = scanner.nextInt();
			System.out.println(n);
		} else {
			System.out.println("ќшибка ввода данных");
		}
		return n;
	}

	public void replacement() {
		String[] words = a.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (n <= words[i].length()) {
				str = "";
				str += words[i].substring(0, n - 1);
				str += '%';
				str += words[i].substring(n, words[i].length());
				words[i] = str;
			}
			System.out.print(words[i] + " ");
		}

	}
}