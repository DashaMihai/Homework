
public class Task4 {

	public static void main(String[] args) {
		String str = "Hello world 2018!";
		//System.out.println();
		String str1 = str.replaceAll("\\d", "");
		char[] array = str1.toCharArray();
		int counter = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (array[i] == ' ') {
				counter = i;
				break;
			}
		}
		
		String result = str1.replaceAll(" ", "");
		StringBuilder build = new StringBuilder(result);
		build.insert(counter, ' ');
		System.out.println(build.toString());
	}

}
