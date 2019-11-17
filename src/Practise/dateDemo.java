package Practise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//current date..current time./
		Calendar cal=Calendar.getInstance();
		Date d= new Date();

		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		// System.out.println(cal.setTimeZone(value));
		int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
System.out.println(noOfDays);



		}

		}

