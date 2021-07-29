package ca.bc.gov.ag.courts.ccd.utils;

/**
 * 
 * @author smillar
 *
 */
public class CCDCommonUtils {

	/**
	 * Copy of original wMethods Java method isNumeric. 
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNumeric(String input) {
		boolean isNumeric = true; 
		try {
			Double.valueOf(input).doubleValue();
		} catch (Exception e) {
			isNumeric = false;
		}
		return isNumeric;
	}
}
