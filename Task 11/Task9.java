
public class Task9 {

	public static void main(String[] args) {
		char[] letters = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		String str = "hello m21 gj3 world hello jk5k22 people";
		String[] masStr = str.split(" ");
		String[] resultMas = new String[masStr.length];
		for (int i = 0; i < masStr.length; ++i) {
			char[] word = masStr[i].toCharArray();
			for (int k = 0; k < word.length; ++k) {
				for (int j = 0; j < letters.length; ++j) {
					if (word[k] == letters[j]) {
						resultMas[i] = masStr[i];
						break;
					} else {
						resultMas[i] = masStr[i].substring(0, 1).toUpperCase() + masStr[i].substring(1);
					}
				}
			}

			System.out.print(resultMas[i] + " ");
		}
	}
}