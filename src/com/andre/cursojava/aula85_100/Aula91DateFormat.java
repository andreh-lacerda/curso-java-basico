package com.andre.cursojava.aula85_100;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Aula91DateFormat {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		String data = "06-06-2022 17:25";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);
			
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);
			
			System.out.println(calendario);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
