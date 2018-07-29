
public class Task10 {

	public static void main(String[] args) {

		String str = "Hello world, 2018! Hello people: 123.";
		char[] c = { '.', ',', '-', ':', ';', '?', '!' };
		int count = 0;

		char[] chStr = str.toCharArray();
		for (int i = 0; i < chStr.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (chStr[i] == c[j]) {
					count++;
				}
			}
		}
		System.out.println("Знаков препинания : " + count);

	}

}
