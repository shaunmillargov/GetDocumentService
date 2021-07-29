package ca.bc.gov.ag.courts.ccd.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Time Date Utils. 
 * 
 * @author 176899
 *
 */
public class TimeDateUtils {
	
	private final String webMethodsDTMFormat = "yyyy-MM-dd HH:mm:ss.S";
	private SimpleDateFormat formatter = new SimpleDateFormat(webMethodsDTMFormat);
	
	public Date wMDatetoDate(String wMDateString) throws ParseException {
		return formatter.parse(wMDateString); 
	}
	
}
