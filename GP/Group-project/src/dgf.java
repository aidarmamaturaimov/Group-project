import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class dgf {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		today.set(Calendar.DAY_OF_MONTH, 1); // same for minutes and seconds
		today.set(Calendar.MONTH, 1); 
		today.set(Calendar.YEAR, 2000); 
		
		String pattern = "dd-mm-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String result = simpleDateFormat.format(today.getTime());
		
		
//		Locale locale = new Locale("en", "GB");
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//		String date = dateFormat.format(D);
		System.out.print(result);
	}

}
