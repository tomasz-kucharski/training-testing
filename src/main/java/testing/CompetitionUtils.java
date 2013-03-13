package testing;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.springframework.util.Assert;

public final class CompetitionUtils {

	private CompetitionUtils() {
	}

	/**
	 * Metoda sprawdza, czy data podana jako argument jest zawarta w interwale
	 * aktualnego dnia.
	 *
	 * @param dateTime
	 * @throws IllegalArgumentException w przypadku gdy dateTime jest nullem.
	 */
	public static boolean isTodaysIntervalContainsDate(final DateTime dateTime) {
		Assert.notNull(dateTime, "Date time is required.");

		Interval todaysInterval = new Interval(LocalDate.now().toDateTimeAtStartOfDay(), Days.ONE);

		if (todaysInterval.contains(dateTime)) {
			return true;
		}

		return false;
	}

}
