//import java.text.ParseException;
//import java.text.SimpleDateFormat;

public class Widening {
	public static void main(String[] args) {
		int x=200;
		long y=500;
		String s="500";
		
//		String sDate="20.2.21";
//		java.util.Date date1=null;
//		try {
//			date1=new SimpleDateFormat("dd/mm/yyyy").parse(sDate);
//		}
//		catch(ParseException e){
//			e.printStackTrace();
//		}
//		System.out.println(date1);
//		
		
		
		int i = Integer.parseInt(s);
		int j = Integer.valueOf(s);
		String k= String.valueOf(x);
		String l= Integer.toString(x);
		//long n = Long.parselong(y);
		long m = Long.valueOf(y);
		
		
		
		System.out.println("String to integer conversion using parseInt : "+i);
		System.out.println("String to integer conversion using valueOf : "+j);
		System.out.println("Integer to String conversion using valueOf : "+k);
		System.out.println("Integer to String conversion using toString : "+l);
		System.out.println("Integer to String conversion using toString : "+m);
		//System.out.println("Integer to String conversion using toString : "+n);
	}
}
