package reto1;

public class Funciones2 {

	public static int restar(int n1, int n2) {

		return n1 - n2;
	}
	public static int dividir(int n1, int n2) {
		int division = 0;
		if (n2!=0) {
			division = n1/n2;
			System.out.println("division");
		}else {
			System.out.println("no se puede dividir por cero");
		}
		return division;
	}

}
