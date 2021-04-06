import java.time.LocalDate;

public class LocalDateLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2020, 6, 25);  
	    System.out.println(date1.isLeapYear());  
	    LocalDate date2 = LocalDate.of(2021, 8, 15);  
	    System.out.println(date2.isLeapYear());  

	}

}
