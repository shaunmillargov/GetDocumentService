package ca.bc.gov.ag.courts.ccd.model;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ca.bc.gov.ag.courts.ccd.utils.CCDwsConstants;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocument.Document;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocument.GetDocument;

/**
 * 
 * GetDocument Object Tests
 * 
 * @author smillar
 *
 */
public class GetDocumentTest {

	@Test
	public void testObj() {

		GetDocument request = new GetDocument();
		request.setDocumentRequest(new Document());
		
		request.getDocumentRequest().setCourtDivisionCd("I");
		request.getDocumentRequest().setDocumentId("12345.0009");
		request.getDocumentRequest().setFlattenYN( 
			    new JAXBElement<String>(new QName(CCDwsConstants.CCDSOA_PKG_NAME, "FlattenYN"), String.class, "Y"));
		

		Assertions.assertEquals("I", request.getDocumentRequest().getCourtDivisionCd());
		Assertions.assertEquals("12345.0009", request.getDocumentRequest().getDocumentId());
		Assertions.assertEquals("Y", request.getDocumentRequest().getFlattenYN().getValue());

	}

}
