import java.io.FileReader;
import java.util.Scanner;

public class Task8_dop1 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();

		FileReader fr = new FileReader(n);
		Scanner scan = new Scanner(fr);

		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());

		}

		fr.close();
	}

}
