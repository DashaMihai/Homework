
public class Task12 {

	public static void main(String[] args) {
		StringBuilder comment = new StringBuilder("String str = \"Hello world (2018)!\"; // создание строки");

		System.out.println(comment.delete(comment.indexOf("//"), comment.length()));
	}

}