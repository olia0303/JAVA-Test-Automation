package core;
public class Massive {
	 /* ����� printMassiveAsLine, ������� ��������� � �������� ���������� ������ �
	 * �������� ��� � ������� � ���� ������, ������ �� ����������;
	 */
	public void printMassiveAsline(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			System.out.print(anyMas[i] + " ");
		}
		System.out.println("  ");
	}
	/* ����� printReverseMassiveAsLine, ������� ��������� � �������� ����������
	 * ������ � �������� ��� � ������� � ���� ������ � �������� �������, ������ ��
	 * ����������;
	 */
	public void printReverseMasssiveAsline(int[] anyMas) {
		for (int i = anyMas.length - 1; i >= 0; i--) {
			System.out.print(anyMas[i] + " ");
		}
		System.out.println("  ");
	}
	// ����� getSumOfElements, ������� ��������� ������, � ���������� ����� ���
	// ���������;
	public int getSumofElements(int[] anyMas) {
		int sum = 0;
		for (int i = 0; i < anyMas.length; i++) {
			sum = sum + anyMas[i];
		}
		return sum;
	}
	/* ����� multiptyBy3, ������� ��������� ������, �������� ������ ������� �������
	 * �� 3 � ���������� ���������� ������;
	 */
	public int[] multiptyBy3(int[] anyMas) {
		for (int i = 0; i < anyMas.length; i++) {
			anyMas[i] = anyMas[i] * 3;
		}
		return anyMas;
	}

}
	
	

