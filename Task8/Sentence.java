import java.util.Scanner;

public class Sentence implements Iparagraph {
	public static String a;

	@Override
	public void getInfo() {
		System.out.println("¬ведите текст");
	}

	@Override
	public String scanText() {
		Scanner text = new Scanner(System.in);
		if (text.hasNextLine()) {
			a = text.nextLine();
			System.out.println(a);
		} else {
			System.out.println("ќшибка ввода");
		}
		return a;
	}
}