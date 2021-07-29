package ca.bc.gov.ag.courts.ccd.getdocument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ca.bc.gov.ag.courts.ccd.utils.CCDwsConstants;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocumentsecure.DocumentResult;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocumentsecure.GetDocumentSecure;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocumentsecure.GetDocumentSecureResponse;

/**
 * 
 * Main getDocumentSecure endpoint (Secured version)
 * 
 * @author smillar
 * 
 * See ReadMe.MD for document ids for testing. 
 *
 */

@Endpoint
public class DocumentSecureEndpoint {
	

	@Autowired
	public DocumentSecureEndpoint() {}

	@PayloadRoot(namespace = CCDwsConstants.NAMESPACE_URI_SECURE, localPart = "getDocumentSecure")
	@ResponsePayload
	public GetDocumentSecureResponse getDocumentSecure(@RequestPayload GetDocumentSecure request) throws Exception  {
		
		GetDocumentSecureResponse response = new GetDocumentSecureResponse();
		response.setDocumentResponse(new DocumentResult()); 
		
		System.out.println("\n-----");
		System.out.println("Received DocumentId: " + request.getDocumentSecureRequest().getDocumentId());
		System.out.println("Received CourtDivisionCd: " + request.getDocumentSecureRequest().getCourtDivisionCd());	
		
		response.setDocumentResponse(new DocumentResult());
		response.getDocumentResponse().setB64Content("abcdef");
		response.getDocumentResponse().setResultCd("1");
		response.getDocumentResponse().setResultMessage("success");
		
		return response;
	}
		
}
