
public class Task8_1 {

	public static void main(String[] args) {

		Sentence sent = new Sentence();
		sent.getInfo();
		sent.scanText();

		Sentence word = new Letter();
		word.getInfo();

		Letter numb = new Letter();
		numb.scanNumber();
		numb.replacement();
	}
}