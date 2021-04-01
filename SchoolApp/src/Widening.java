import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Widening {
	public static void main(String[] args) {
		int x=200;
		
		String s="500";
		
		String sdate="Fri, 04/03/2021, 23:37:50";
		Date date1=null;
		try
		{
			date1=new SimpleDateFormat("E, dd/MM/YYYY, HH:MM:SS").parse(sdate);
		}
		catch(ParseException e)
		{
			System.out.println(e);
		}
		
		System.out.println(date1);
			
		
		int i = Integer.parseInt(s);
		int j = Integer.valueOf(s);
		String k= String.valueOf(x);
		String l= Integer.toString(x);
//		long n = Long.parseLong(x);
		long m = Long.valueOf(x);
		
		
		
		System.out.println("String to integer conversion using parseInt : "+i);
		System.out.println("String to integer conversion using valueOf : "+j);
		System.out.println("Integer to String conversion using valueOf : "+k);
		System.out.println("Integer to String conversion using toString : "+l);
		System.out.println("Integer to Long conversion using valueOf : "+m);
//		System.out.println("Integer to Long conversion using parseLong : "+n);
	}
}
