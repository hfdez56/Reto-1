package reto1;

import java.util.Scanner;

public class Funciones2 {

	public static int restar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("un numero");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.println("otro");
		int n2 = Integer.parseInt(sc.nextLine());
		int resta = n1 - n2;
		System.out.println(resta);
		sc.close();
		return resta;
	}
	
	public static void main(String[] args) {
		restar();

	}

}
