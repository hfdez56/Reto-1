package reto1;

import java.util.Scanner;

public class Funciones1 {

	public static int sumar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el primer número");
		int n2 = Integer.parseInt(sc.nextLine());
		int suma = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + suma);
		sc.close();
		return suma;
	}
	
	public static void main(String[] args) {
		sumar();
	}
}
