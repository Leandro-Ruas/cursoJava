package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AulaCentoETreze {

	public static void main(String[] args) {

		/**
		 * Calculos com data-hora
		 * Data-hora +/- tempo -> Data-hora
		 * Data-hora 1, Data-hora 2 -> Duracao
		 * */
		
		LocalDate d04 = LocalDate.parse("2023-06-17");
		LocalDateTime d05 = LocalDateTime.parse("2023-06-17T15:38:26");
		Instant d06 = Instant.parse("2023-06-17T15:38:26Z");
		
		LocalDate pastweekLocalDate = d04.minusDays(7);
		LocalDate nextweekLocalDate = d04.plusDays(7);
		
		System.out.println("pastweekLocalDate = "+ pastweekLocalDate);
		System.out.println("nextweekLocalDate = "+ nextweekLocalDate);
		
		LocalDateTime pastweekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextweekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastweekLocalDateTime = "+ pastweekLocalDateTime);
		System.out.println("nextweekLocalDateTime = "+ nextweekLocalDateTime);
		
		Instant pastweekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextweekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastweekInstant = "+ pastweekInstant);
		System.out.println("nextweekInstant = "+ nextweekInstant);
		
		Duration t1 = Duration.between(pastweekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastweekLocalDateTime, d05);
		Duration t3 = Duration.between(pastweekInstant, d06);
		Duration t4 = Duration.between(d06, pastweekInstant);
		
		System.out.println("t1 = " + t1.toDays());
		System.out.println("t2 = " + t2.toDays());
		System.out.println("t3 = " + t3.toDays());
		System.out.println("t4 = " + t4.toDays());
		
	}

}
