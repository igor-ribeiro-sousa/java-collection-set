package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidade.LogEntrada;

public class Programa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo");
		String path = scan.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntrada> set = new HashSet<>();
			
			String linha = br.readLine();
			while(linha != null) {
				String[] fields = linha.split(" ");
				String nome= fields[0];
				Date momento = Date.from(Instant.parse(fields[1]));
				
				set.add(new LogEntrada(nome, momento));
				
				linha = br.readLine();
			}
			System.out.println("Total nome: " + set.size());
			
		}catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		finally {
			scan.close();
		}
	}

}
