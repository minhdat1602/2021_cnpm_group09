package com.nlu.util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateProcess {
	public static long daysBetween2Dates(String startDate, String endDate) {
		// Định dạng thời gian
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		// Định nghĩa 2 mốc thời gian ban đầu
		Date date1 = Date.valueOf(startDate);
		Date date2 = Date.valueOf(endDate);

		c1.setTime(date1);
		c2.setTime(date2);

		// Công thức tính số ngày giữa 2 mốc thời gian:
		long noDay = (c2.getTime().getTime() - c1.getTime().getTime()) / (24 * 3600 * 1000);

		System.out.print("Số ngày giữa " + dateFormat.format(c1.getTime())

				+ " và " + dateFormat.format(c2.getTime()) + ": ");

		System.out.println(noDay);
		return noDay;
	}
}
