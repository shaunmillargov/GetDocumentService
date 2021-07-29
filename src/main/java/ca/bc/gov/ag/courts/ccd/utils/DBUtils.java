package ca.bc.gov.ag.courts.ccd.utils;

import java.util.Date;

/**
 * Various DB type utilities. 
 * 
 * @author smillar
 *
 */
public class DBUtils {
	
	
	/**
	 * Utility function for converting boolean to DB "Y" or "N"
	 * @param value
	 * @return
	 */
	public static String getBooleanYN(boolean value) {
		return value == true ? "Y":"N";
	}
	
	/**
	 * Utility function for converting string "Y" or "N" to boolean value. 
	 * @param value
	 * @return
	 */
	public static Boolean getBooleanFromYN(String value) {
		if (null != value) {
			return value.equalsIgnoreCase("Y") ? true: false;
		} else {
			return false;
		}
	}
	
	/**
	 * Safely converts outbound Java Date to SQL Date. 
	 * @param jDate
	 * @return
	 */
	public static Object getSqlDate(Date date) {
		try {
			return new java.sql.Date(date.getTime());
		} catch (NullPointerException npe) {
			return null;
		}

	}

	/**
	 * Safely converts outbound Java Date to SQL Time and Date 
	 * @param jDate
	 * @return
	 */
	public static Object getSqlTimeStamp(Date date) {
		try {
			return new java.sql.Timestamp(date.getTime());
		} catch (NullPointerException npe) {
			return null;
		}
	}
	
}
