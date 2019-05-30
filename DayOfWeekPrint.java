/**
 * A (bad) implementation of printing the
 * day of week for a given date.
 *
 * Date is expected in format : 
 *
 *      MM DD YYYY
 */

import java.io.*;
import java.util.*;

class DayOfWeekPrint {

    static enum DayOfWeek {
        SUNDAY(Calendar.SUNDAY),
        MONDAY(Calendar.MONDAY),
        TUESDAY(Calendar.TUESDAY),
        WEDNESDAY(Calendar.WEDNESDAY),
        THURSDAY(Calendar.THURSDAY),
        FRIDAY(Calendar.FRIDAY),
        SATURDAY(Calendar.SATURDAY);
    
        private final int value;

        private DayOfWeek (int value) {
            this.value = value;
        }
            
        public int value() {
            return value;
        }
    }
        
    private static DayOfWeek getDayOfWeek(int dayOfWeek) {
        
        for (DayOfWeek day : DayOfWeek.values())
            if (dayOfWeek == day.value())
                return day;
        
        // In case of invalid day of week return null
        return null;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        
        // fix the month to be in range [0,11]
        int corrected_month = month - 1;
        
        Calendar cal = new GregorianCalendar(year, corrected_month, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(getDayOfWeek(dayOfWeek));
    }
}

