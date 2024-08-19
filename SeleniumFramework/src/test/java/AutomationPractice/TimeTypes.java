package AutomationPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeTypes {
    public static void main(String[] args) {
        LocalTime openingHour = LocalTime.of(11,0);
        LocalTime closingHour = LocalTime.of(22,0);
        System.out.println("The restaurant is open from "+openingHour+ " to " + closingHour +" in everyday");
        LocalDate orderDate = LocalDate.now().minusDays(2);
        System.out.println("The pizza was ordered on "+orderDate);
        LocalDateTime orderDateTime = LocalDateTime.from(orderDate.atStartOfDay()).withHour(17);
        System.out.println("I submitted the order "+orderDateTime);
        LocalTime deliveryTime = LocalTime.of(1,20);
        System.out.println("Delivery Time --> "+deliveryTime);
        LocalDateTime estimatedDeliveryDateTime=orderDateTime.plusHours(deliveryTime.getHour()).plusMinutes(deliveryTime.getMinute());
        System.out.println("Estimated delivery Time is "+estimatedDeliveryDateTime);
        LocalDateTime realDateTime=orderDateTime.plusMinutes(90);
        System.out.println("Real Date Time "+realDateTime);
        long differenceBetweenRealAndEstimated = ChronoUnit.MINUTES.between(estimatedDeliveryDateTime,realDateTime);
        System.out.println(differenceBetweenRealAndEstimated);
    }
}
