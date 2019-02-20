package core;

public class Massive {
	int[] anyMas;
	int result;

	public Massive() {

	}

	public int[] recordReverseMas(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print(anyMas[i] + " ");
		}
		return anyMas;
	}

	public int getSumofElements(int[] anyMas) {
		int sum = 0;
		for (int i = 0; i < anyMas.length; i++) {
			sum = sum + anyMas[i];
		}
		return sum;
	}

	public int getMasProduct(int[] anyMas) {
		int product = 1;
		for (int i = 0; i < anyMas.length; i++) {
			product = product * anyMas[i];
		}
		return product;
	}

	public int getMasMin(int[] anyMas) {
		int min = anyMas[0];
		for (int i = 0; i < anyMas.length; i++) {
			if (min > anyMas[i])
				min = anyMas[i];
		}
		return min;
	}

	public int[] eachElementDividedNext(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {

			anyMas[i] = anyMas[i] / i;
		}
		return anyMas;
	}

}
