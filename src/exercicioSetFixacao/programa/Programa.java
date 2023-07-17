package exercicioSetFixacao.programa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int quantidadeA = scan.nextInt();
		for(int i = 0; i < quantidadeA; i++) {
			int numero = scan.nextInt();
			a.add(numero);
		}
		
		System.out.print("How many students for course B? ");
		int quantidadeB = scan.nextInt();
		for(int i = 0; i < quantidadeB; i++) {
			int numero = scan.nextInt();
			b.add(numero);
		}
		
		System.out.print("How many students for course C? ");
		int quantidadeC = scan.nextInt();
		for(int i = 0; i < quantidadeC; i++) {
			int numero = scan.nextInt();
			b.add(numero);
		}
		
		Set<Integer> total = new HashSet<>(a);
		
		total.addAll(b);
		total.addAll(c);
		
		System.out.print("Total students: " + total.size());
		
		scan.close();
		
	}

}
