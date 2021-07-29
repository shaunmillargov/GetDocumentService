package ca.bc.gov.ag.courts.ccd.utils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * 
 * @author smillar
 *
 */
public class CCDwsConstants {
	
	public static final String NAMESPACE_URI = "http://courts.gov.bc.ca/CCD.Source.GetDocument.ws:GetDocument";
	public static final String NAMESPACE_URI_SECURE = "http://courts.gov.bc.ca/CCD.Source.GetDocumentSecure.ws:GetDocumentSecure";
	
	public static final String CCDSOA_PKG_NAME = "CCD_COMMON_UTILS";
	
	public static final int CCDWS_SUCCESS_CD = 1;
	public static final int CCDWS_TICKETEDURL_SUCCESS_CD = 1;
	
	public static final BigDecimal CCDWS_GENERAL_FAILURE_CD = new BigDecimal(0);
	public static final int DOC_NOT_FOUND = 2;

	public static final String CCDWS_SUCCESS_MSG = "success";
	public static final String CCDWS_GENERAL_FAILURE_MSG = "Fail";
	public static final String CCDWS_DOC_NOT_FOUND_MSG = "Document not found";
	public static final String CCDWS_BAD_COURTDIVISION_MSG = "CourtDivisionCD must be 'R' or 'I'";
	
	public static final String UCP_POOL_NAME = "getdoc_connection_pool";
	
	// Allowable Court Division CDs. 
	public static Set<String> allowableCourtDivisionCds = new HashSet<>(Arrays.asList("I", "R"));
	
}
