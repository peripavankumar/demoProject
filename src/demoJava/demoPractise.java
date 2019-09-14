package demoJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class demoPractise {

public static void main(String[] args) {
	
DateFormat df= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

Calendar a = Calendar.getInstance();
System.out.println("Instance:"+a);
//TimeStamp using Calendar Field
System.out.println("Using Calendar Timestamp:"+df.format(a.getTime()));

Date d= new Date();
System.out.println("Current Date:"+d);
// TimeStamp using Date Field
System.out.println("using Date Timestamp:"+df.format(d));

LocalDate l=LocalDate.now();
System.out.println("Date Now:"+l);
System.out.println(l.getDayOfMonth());
System.out.println(l.getMonthValue());
System.out.println(l.getYear());
System.out.println("Formating the Date:"+l.getMonthValue()+"/"+l.getDayOfMonth()+"/"+l.getYear());
}
}
