import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.TimeZone;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today=LocalDate.now();
		Supplier<LocalDate> nextDayOfWeekIs= () -> today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(nextDayOfWeekIs.get());
		
		TimeZone timeZone=TimeZone.getTimeZone("EST");
	}

}
