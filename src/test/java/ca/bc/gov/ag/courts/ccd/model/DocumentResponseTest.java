package ca.bc.gov.ag.courts.ccd.model;

import java.io.IOException;

import javax.activation.DataHandler;

import org.apache.commons.codec.binary.Base64InputStream;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import ca.bc.gov.ag.courts.ccd.utils.CCDwsConstants;
import ca.bc.gov.ag.courts.ccd.utils.InputStreamDataSource;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocument.DocumentResult;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocument.GetDocumentResponse;

/**
 * 
 * GetDocumentResponse Object Tests
 * 
 * @author smillar
 *
 */
public class DocumentResponseTest {

	@Test
	public void testObj() throws IOException {
		
		GetDocumentResponse response = new GetDocumentResponse();
		
		response.setDocumentResponse(new DocumentResult());

		// Read in a text file, base64 encode it and set it to the DataHandler. 
		Resource aFileResource = new ClassPathResource("textfile.txt");
		Base64InputStream bi = new Base64InputStream(aFileResource.getInputStream(), true, 80, new String("\n").getBytes());  
		InputStreamDataSource is = new InputStreamDataSource(bi);
		DataHandler dh = new DataHandler(is);
		response.getDocumentResponse().setB64Content(dh);
		
		response.getDocumentResponse().setResultCd(String.valueOf(CCDwsConstants.CCDWS_TICKETEDURL_SUCCESS_CD));
		response.getDocumentResponse().setResultMessage(CCDwsConstants.CCDWS_SUCCESS_MSG);
		
		// Read out the base64 encoded string and compare to the expected. 
		byte[] bytes = IOUtils.toByteArray(response.getDocumentResponse().getB64Content().getInputStream());
		Assertions.assertEquals(new String("MTIzNA==\n"), new String(bytes));
		
		Assertions.assertEquals(CCDwsConstants.CCDWS_SUCCESS_CD, Integer.parseInt(response.getDocumentResponse().getResultCd()));
		Assertions.assertEquals(CCDwsConstants.CCDWS_SUCCESS_MSG, response.getDocumentResponse().getResultMessage());

	}

}
