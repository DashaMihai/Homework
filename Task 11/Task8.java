
public class Task8 {

	public static void main(String[] args) {
		char[] letters = { 'a', 'e', 'i', 'o', 'u', 'y' };
		String str = "Hello world!";
		String str1 = str.toLowerCase();
		String str2 = str1.replaceAll("\\s|!", "");
		int count = 0;
		int gen = 0;
		char[] stringToReplace = str2.toCharArray();
		for (int i = 0; i < stringToReplace.length; i++) {
			count = 0;

			for (int j = 0; j < letters.length; j++) {
				if (stringToReplace[i] != letters[j]) {
					count++;
				}
			}
			if (count == letters.length) {
				gen++;
				count = 0;
			}
		}
		System.out.println("Согласные : " + gen);

	}

}
