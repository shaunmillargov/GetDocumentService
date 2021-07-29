package ca.bc.gov.ag.courts.ccd.getdocument;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ca.bc.gov.ag.courts.ccd.utils.CCDwsConstants;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocumentsecure.DocumentResult;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocumentsecure.DocumentSecureRequest;
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
	
	protected Logger log = Logger.getLogger(this.getClass());

	@Autowired
	public DocumentSecureEndpoint() {}

	@PayloadRoot(namespace = CCDwsConstants.NAMESPACE_URI_SECURE, localPart = "getDocumentSecure")
	@ResponsePayload
	public GetDocumentSecureResponse getDocumentSecure(@RequestPayload GetDocumentSecure request) throws Exception  {
		
		
		GetDocumentSecureResponse response = new GetDocumentSecureResponse();
		response.setDocumentResponse(new DocumentResult()); 
		
		log.info("\n-----");
		log.info("Received DocumentId: " + request.getDocumentSecureRequest().getDocumentId());
		log.info("Received CourtDivisionCd: " + request.getDocumentSecureRequest().getCourtDivisionCd());	
		
	
		response.setDocumentResponse(new DocumentResult());
		response.getDocumentResponse().setB64Content("abcdef");
		response.getDocumentResponse().setResultCd("1");
		response.getDocumentResponse().setResultMessage("success");
		
		return response;
	}
		
}
