
public class Task11 {

	public static void main(String[] args) {
		String str = "Hello1 world3, 45! Hello people: 678.";
		char[] chars = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= '0' && chars[i] <= '9')
				sum += Character.getNumericValue(chars[i]);
		}
		System.out.println("Сумма всех целых чисел в строке равна " + sum);

	}

}