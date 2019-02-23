package core;

public class Massive {

	public int[] recordMasRandomly(int size) {
		int[] anyMas = new int[size];
		int a = 20;
		int b = 50;
		for (int i = 0; i < anyMas.length; i++) {
			anyMas[i] = a + (int) (Math.random() * (b - a));
		}
		return anyMas;
	}

	public int[] getReverseMas(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print(anyMas[i] + " ");
		}
		return anyMas;
	}

	public int[] getMasMultiply(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			anyMas[i] = anyMas[i] * 2;
		}
		return anyMas;

	}

	public int getMasMax(int[] anyMas) {
		int max = anyMas[0];
		for (int i = 0; i < anyMas.length; i++) {
			if (max < anyMas[i])
				max = anyMas[i];
		}
		return max;
	}

	public int getSumOfElements(int[] anyMas) {
		int sum = 0;
		for (int i = 0; i < anyMas.length; i++) {
			sum = sum + anyMas[i];
		}
		return sum;
	}

	public int getMasMinIndex(int[] anyMas) {
		int min = anyMas[0];
		int index_min = 0;
		for (int i = 1; i < anyMas.length; i++) {
			if (min > anyMas[i]) {
				min = anyMas[i];
				index_min = i;
			}
		}
		return index_min;
	}

	public int getMasMaxIndex(int[] anyMas) {
		int index_max = 0;
		int max = anyMas[0];
		for (int i = 1; i < anyMas.length; i++) {
			if (max < anyMas[i]) {
				max = anyMas[i];
				index_max = i;
			}
		}
		return index_max;
	}

	public int[] eachElementDividedNext(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {

			anyMas[i] = anyMas[i] / i;
		}
		return anyMas;
	}

	public int getMasProduct(int[] anyMas) {
		int product = 1;
		for (int i = 0; i < anyMas.length; i++) {
			product = product * anyMas[i];
		}
		return product;
	}

	public int numberInSquare(int num) {
		return num * num;
	}

	public int sumNumbers(int num, int num2) {
		return num + num2;
	}

	public int checkZeroElementsInMas(int[] anyMas) {
		int result = 0;
		for (int i = 0; i < anyMas.length; i++) {
			if (anyMas[i] == 0) {
				result++;
			}
		}
		return result;
	}

}
