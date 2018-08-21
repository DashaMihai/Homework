package home;

import java.util.Arrays;
import java.util.List;

public class Massive {
	int n = 0;
	int[] mas = { 6, 3, 5, 2, 7, 1 };

	// 1
	public int[] getMas() {
		return mas;
	}

	// 2
	public int MasMult() {
		int a = 1;
		for (int i = 0; i < mas.length; i++) {
			a *= mas[i];
		}
		return a;
	}

	// 3
	public int MasZero() throws Exception {
		int b = 0;
		try {
			for (int i = 3; i < mas.length; i += 4) {
				b = mas[i] / n;
			}
			return b;
		}

		catch (ArithmeticException e) {
			System.out.println("На ноль делить нельзя");
			throw e;
		}
	}

	// 4
	public int MaxIndex() {
		int maxIndex = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[maxIndex] < mas[i]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	// 5
	public int MinIndex() {
		int minIndex = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[minIndex] > mas[i]) {
				minIndex = i;
			}
		}
		return minIndex;
	}

	// 6
	public int MasPlus() {
		int b = 0;
		for (int i = 0; i < mas.length; i++) {
			b += mas[i];
		}
		return b;
	}

}
