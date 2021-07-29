package ca.bc.gov.ag.courts.ccd.utils;

import javax.xml.bind.JAXBElement;
import org.springframework.stereotype.Component;

/**
 * 
 * Common methods shared between the two web service operations
 * 
 * @author 176899
 *
 */
@Component
public class GetDocCommonServices {
	
	/**
	 * Fetch FlattenYN value
	 * 
	 * @param value
	 * @return
	 */
	public String GetFlattenYN(JAXBElement<String> value) {
		if (null == value || value.isNil()) 
			return "N";
		else 
			return value.getValue();
	}
	
	/**
	 * Validate for proper CourtDivisionCd
	 * 
	 * @param courtDivisionCd
	 * @return
	 */
	public boolean ValidateCourtDivisionCd(String courtDivisionCd) {
		if (null == courtDivisionCd || !CCDwsConstants.allowableCourtDivisionCds
				.contains(courtDivisionCd)) {
			return false;
		} else
			return true;
	}

}
