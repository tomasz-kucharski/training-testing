package testing;

import org.apache.commons.lang3.StringUtils;

public final class FilterUtils {

	public static final int MIN_STR_LENGTH = 3;

	private FilterUtils() {
	}

	/*
	 * metoda sprawdza czy zostal ustawiony poprawnie parametr po ktorym odbywac
	 * bedzie sie wyszukiwanie
	 * @return
	 */
	public static boolean validFilterString(final String strField) {
		if (StringUtils.isEmpty(strField) || (StringUtils.isNotEmpty(strField) && strField.length() >= MIN_STR_LENGTH)) {
			return true;
		}
		return false;
	}
}
