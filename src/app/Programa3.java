package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Programa3 {
	
	public static void main(String[]args) {
		LocalDate d04 = LocalDate.parse("2023-07-20");
		LocalDateTime d05= LocalDateTime.parse("2023-07-20T01:30:26");
		Instant d06 = Instant.parse("2023-07-20T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d04.minusDays(7); 
		LocalDate nexWeekLocalDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime= d05.minusDays(7);
		LocalDateTime nexWeekLocalDateTime= d05.plusDays(7); 
		
		Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS);
		Instant nexWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		
		System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
		System.out.println("nexWeekLocalDate = "+nexWeekLocalDate);
		
		System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
		System.out.println("nexWeekLocalDateTime = "+nexWeekLocalDateTime);
		
		System.out.println("pastWeekInstant = "+pastWeekInstant);
		System.out.println("nexWeekInstant = "+nexWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t3 = Duration.between(pastWeekInstant,d06);
		
		System.out.println("T1 dias= "+t1.toDays());
		System.out.println("T2 dias= "+t2.toDays());
		System.out.println("T3 dias= "+t3.toDays());
		
		
		
	}

}
