package com.cts.date;

import java.util.Date;

public class DateCalculator {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("deprecation")
		Date d1 =new Date(2020,8,7);
		
		System.out.println("frist date :"+d1);
		@SuppressWarnings("deprecation")
		Date d2=new Date(2022,8,6);
		System.out.println("Second date :"+d2);
		
		
		int dateValue=d2.compareTo(d1);
		System.out.print( " Date comparision   "+dateValue);
		
	}
}
