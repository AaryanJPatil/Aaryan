package DateExample;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date =new Date();
        System.out.println(date);
        System.out.println("Time is"+date.getTime());

        Calendar cal =Calendar.getInstance();

        System.out.println("cal time is"+cal.getTime());
        cal.add(Calendar.DATE,10);
        System.out.println("updated cal by adding 10 days"+cal.getTime());
        cal.add(Calendar.MONTH,-1);
        System.out.println("updated cal by minus 1 month"+cal.getTime());


    }

    private String getTime() {
        return null;
    }
}
