
public class Task5 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello world (2018)!");
		
		System.out.println(str.delete(str.indexOf("("),str.lastIndexOf(")")+1));


	}

}
