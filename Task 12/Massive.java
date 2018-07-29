
public class Massive {

	public static void main(String[] args) {
		int n = 2;
		int[] mas = { 1, 2, 3 };
		int[] mas1 = new int[n];
		int[] mas2 = null;

//1. try- catch
		try {
			int a = 0;
			for (int i = 2; i < mas.length; i++) {
				a = mas[i] / 0;
				System.out.print(a + " ");
			}
		} catch (ArithmeticException e) {
			System.out.println("На ноль делить нельзя");
		}
// 2. try-catch, где catch будет несколько
		try {
			for (int i = 0; i < mas.length; i++) {
				mas1[i] = mas[i];
				System.out.print(mas1[3] + " ");
			}
		} catch (ArithmeticException e) {
			System.out.println("На ноль делить нельзя");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Выход за пределы массива");
		}
//3. try -catch, с использованием multi-catch
		try {
			for (int i = 0; i < mas.length; i++) {
				mas2[i] = mas[i] / 0;
				mas2[6] = n;
				System.out.print(mas2[6] + " ");
			}

		} catch (NullPointerException | ArithmeticException e) {
			System.out.println("Ошибка данных");
		}
//4. try-catch-finally
		try {

			for (int i = 2; i < mas.length; i++) {
				mas1[i] = mas[i] / mas2.length;
				System.out.print(mas[i] + " ");
			}
		} catch (ArithmeticException e) {
			System.out.println("На ноль делить нельзя");
		} catch (NullPointerException e) {
			System.out.println("Создайте объект");

		} finally {
			System.out.println("работаем дальше");

		}
		
		
	}
}
