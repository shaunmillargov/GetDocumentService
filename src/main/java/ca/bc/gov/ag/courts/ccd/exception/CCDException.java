package ca.bc.gov.ag.courts.ccd.exception;

/**
 * Custom Exception for CCD WS
 * 
 * @author smillar
 */
public class CCDException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6122978310784206251L;

	public CCDException(String message) {
		super(message);
	}

	public CCDException(String message, Throwable cause) {
		super(message, cause);
	}

}
