import java.util.Calendar;
import java.util.GregorianCalendar;

class CurrentDate {
  public static void main(String[] arg) {
    Calendar cal = new GregorianCalendar(2004, 1, 29);
    System.out.println(cal.get(Calendar.YEAR));
    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    System.out.println(Calendar.JANUARY);
  }
}
