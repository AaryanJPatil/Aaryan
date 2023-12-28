package DateExample;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println("Today timing is \t"+time);

        LocalTime newTime = LocalTime.of(12, 30, 24);
        System.out.println("user time is "+newTime);

        System.out.println("Before 2 hr time is "+newTime.minusHours(2));
        System.out.println("After 3 hr time is "+newTime.plusHours(3));

    }
}
