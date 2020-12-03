package com.valeria.lambdsaStreams.Extras;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainFechas {

	public static void main(String[] args) {
		
		//localDates();
		//localTime();		
		localDateTime();
		//zonedDateTime();		
		//period();
		//duration();
		
		//parsearFechas();
	}
	
	public static void parsearFechas() {
		
		LocalDate hoy = LocalDate.parse("2020-07-06");
		
		System.out.println( hoy );
		
		LocalDate seisNov = LocalDate.parse("30/11/2020",  DateTimeFormatter.ofPattern("dd/MM/yyyy") );
		
		System.out.println( seisNov );
		
		
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd");
		String text = date.format(formatter);
		
		System.out.println( text );
		
		LocalDateTime fechaIso = LocalDateTime.parse( "2020-10-31T23:54:45.000Z", 
											  DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'") );
		
		
		System.out.println( "fechaIso " + fechaIso );
		
	}
	
	public static void duration() {
		
		LocalTime inicio = LocalTime.of(8, 30);
		LocalTime fin = inicio.plusHours(3);
		
		System.out.println( Duration.between( inicio , fin ).getSeconds() );
		
		
		
	}
	 
	public static void period() {
		
		LocalDate inicio = LocalDate.of(2020,Month.NOVEMBER,19);
		LocalDate fin = LocalDate.of(2020,Month.DECEMBER,3);
		
		int dias = Period.between( inicio, fin ).getDays();
		System.out.println("dias " + dias );
		
	}
	
	public static void localDateTime() {
		
		LocalDateTime localDateTime = LocalDateTime.now() ; 
		//System.out.println( localDateTime );
		
		LocalDateTime dataTimeOf = LocalDateTime.of(2020, Month.NOVEMBER, 26, 22, 30);
		//System.out.println( dataTimeOf );
		
		
	   LocalDate localDate = LocalDate.parse("2019-01-04");
         
        LocalDateTime localDateTime1 = localDate.atStartOfDay();
        System.out.println(localDateTime1);
		
	}
	
	public static void zonedDateTime() {
		
		ZoneId.getAvailableZoneIds().forEach(z -> System.out.println(z));
		
		ZoneId zoneId = ZoneId.of("America/Panama");
		
		LocalDateTime localDateTime = LocalDateTime.of(2020, Month.NOVEMBER, 27, 11, 22);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of( localDateTime, zoneId );  
		
		System.out.println( zonedDateTime );
		
		ZonedDateTime zonedBuenosAires = ZonedDateTime.of( localDateTime, ZoneId.of("America/Argentina/Buenos_Aires") );
		
		System.out.println(  zonedBuenosAires );
		
		System.out.println( localDateTime.atZone(ZoneId.of("America/Argentina/Buenos_Aires")) );
		
		System.out.println( "Ultimo " +  ZonedDateTime.now() );
		
	}
	
	
	public static void localTime() {
		
		LocalTime localTime = LocalTime.now();
		System.out.println( localTime );
		
		LocalTime hour = LocalTime.of(06,30);
		System.out.println( hour );
		
		//sumo una hora 
		
		LocalTime hourPlus = hour.plus(1, ChronoUnit.HOURS);
		System.out.println( hourPlus );
		
		// resto segundos 
		
		LocalTime hourMinus = hour.minus(60, ChronoUnit.SECONDS );
		System.out.println( hourMinus );
		
		//Comparar Fechas 
		
		boolean isBefore = LocalTime.parse("06:00").isBefore( LocalTime.parse("18:00") );
		
		System.out.println( isBefore );
		
	}
	
	public static void  localDates() {
		
		LocalDate localDate = LocalDate.now();		
		System.out.println( localDate );
		
		
		LocalDate localDateOf = LocalDate.of(2020, Month.JANUARY, 10);		
		System.out.println( localDateOf );
		
		
		LocalDate localDatePlus = localDateOf.plusDays(4);
		System.out.println( localDatePlus );
		
		
		LocalDate localDateMinus = localDateOf.minusDays(4);
		System.out.println( localDateMinus );
		
		boolean isBefore = LocalDate.of(2020, Month.NOVEMBER, 26)
				.isBefore( LocalDate.of(2020, Month.NOVEMBER, 29) );
		
		System.out.println(  isBefore );
	}

}
