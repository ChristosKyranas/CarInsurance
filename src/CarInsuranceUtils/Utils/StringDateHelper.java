package CarInsuranceUtils.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringDateHelper {

    public static final String DATE_FORMAT = "d/M/yyyy";

    public static boolean isExpiredInsurance(String vehicleInsuranceExpiredDate) {
        return LocalDate.parse(vehicleInsuranceExpiredDate, DateTimeFormatter.ofPattern(DATE_FORMAT)).compareTo(LocalDate.now()) > 0;
    }

    public static boolean expiresInRange(String vehicleInsuranceExpiredDate, String daysRange) {
        LocalDate vehiclesExpiredDate = LocalDate.parse(vehicleInsuranceExpiredDate, DateTimeFormatter.ofPattern(StringDateHelper.DATE_FORMAT));
        return (vehiclesExpiredDate.compareTo(LocalDate.now()) > 0 &&
                vehiclesExpiredDate.compareTo(LocalDate.now().plusDays(Long.valueOf(daysRange))) < 0);
    }

    /*public static void main(String[] args) {
        String date = "05/04/2020";
        boolean test = isExpiredInsurance(date);
        System.out.println("First test: " + test);
        test = expiresInRange(date, "10");
        System.out.println("Second test: " + test);

    }*/

}
