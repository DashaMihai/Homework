import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Massive_dop {

	public static void main(String[] args)  {
		 try(FileReader fr = new FileReader("file.txt")) {
	       System.out.print(fr);  
	      }catch(IOException e) {
	    	  System.out.println("Error");
	      }
			
		int n = 2;
		int[] mas = { 1, 2, 3 };
		int[] mas1 = new int[n];

		try {
			for (int i = 0; i < mas.length; i++) {
				try {	
					System.out.print(mas1[3] + " ");
					int a = 0;
					a = mas[i] / 0;					
					
				} catch (ArithmeticException e) {
					System.out.println("На ноль делить нельзя");
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Выход за пределы массива");
		}

	}
}
