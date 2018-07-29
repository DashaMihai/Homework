
public class Task7 {

	public static void main(String[] args) {
		char[] letters = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		String str = "Hello world 2018! Hello people 123!";
		String[] masStr = str.split("[\\s,.!?]+");
		int count = 0;
		int gen = 0;
		String[] resultMas = new String[masStr.length];

		for (int i = 0; i < masStr.length; ++i) {
			char[] word = masStr[i].toCharArray();
			for (int k = 0; k < word.length; k++) {
				for (int j = 0; j < letters.length; j++) {
					if (word[k] == letters[j]) {
						count++;
					}
				}
			}
			if (count == masStr[i].length()) {
				gen++;
				count = 0;
				resultMas[i] = masStr[i];
			}

		}
		String[] resultMas1 = new String[gen];
		int j = 0;
		for (int i = 0; i < resultMas.length; i++) {

			if (resultMas[i] != null) {
				resultMas1[j] = resultMas[i];
				j++;
			}
		}

		for (int k = 0; k < resultMas1.length; k++) {
			System.out.println(resultMas1[k]);
		}
		String maxStr = resultMas1[0];
		for (int k = 1; k < resultMas1.length; ++k) {
			if (resultMas1[k].length() > maxStr.length()) {
				maxStr = resultMas1[k];
			}

		}

		System.out.println("max: " + maxStr);
	}
}
