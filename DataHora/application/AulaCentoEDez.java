package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AulaCentoEDez {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		// Atraves do tipo DateTimeFormatter e possivel determinar a formatacao de entrada da data.
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		// Instanciando data e hora do periodo executado (AGORA).
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		// Lancando Data no formato ISO8601
		// Parse = metodo estatico vc chama a partir do Tipo. dentro dos (), voce pode colcar o texto segundo o padrao citado.
		
		LocalDate d04 = LocalDate.parse("2023-06-17");
		LocalDateTime d05 = LocalDateTime.parse("2023-06-17T15:38:26");
		Instant d06 = Instant.parse("2023-06-17T15:38:26Z");
		Instant d07 = Instant.parse("2023-06-17T15:38:26-03:00");
		
		// instanciacao de texto com formato customizado.
		LocalDate d08 = LocalDate.parse("17/06/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("17/06/2023 15:38", fmt2);
		
		// Instanciar datas a partir de dados isolados. 
		
		LocalDate d10 = LocalDate.of(2023, 06, 17);
		LocalDateTime d11 = LocalDateTime.of(2023, 06, 17, 10, 45);
		
		
		System.out.println("d01 = " + d01 );
		System.out.println("d02 = " + d02 );
		System.out.println("d03 = " + d03 );
		System.out.println("d04 = " + d04 );
		System.out.println("d05 = " + d05 );
		System.out.println("d06 = " + d06 );
		System.out.println("d07 = " + d07 );
		System.out.println("d08 = " + d08 );
		System.out.println("d09 = " + d09 );
		System.out.println("d10 = " + d10 );
		System.out.println("d11 = " + d11 );
	}

}
