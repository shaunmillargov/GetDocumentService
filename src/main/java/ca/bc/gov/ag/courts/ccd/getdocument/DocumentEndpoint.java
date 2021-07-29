package ca.bc.gov.ag.courts.ccd.getdocument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ca.bc.gov.ag.courts.ccd.utils.CCDwsConstants;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocument.DocumentResult;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocument.GetDocument;
import ca.bc.gov.courts.ccd_source_getdocument_ws.getdocument.GetDocumentResponse;

/**
 * 
 * Main getDocument endpoint (Non secured version)
 * 
 * @author smillar
 * 
 *         See ReadMe.MD for document ids for testing.
 *
 */

@Endpoint
public class DocumentEndpoint {

	@Autowired
	public DocumentEndpoint() {
	}

	@PayloadRoot(namespace = CCDwsConstants.NAMESPACE_URI, localPart = "getDocument")
	@ResponsePayload
	public GetDocumentResponse getDocument(@RequestPayload GetDocument request) throws Exception {

		GetDocumentResponse response = new GetDocumentResponse();
		response.setDocumentResponse(new DocumentResult());

		System.out.println("\n-----");
		System.out.println("Received DocumentId: " + request.getDocumentRequest().getDocumentId());
		System.out.println("Received CourtDivisionCd: " + request.getDocumentRequest().getCourtDivisionCd());

		response.getDocumentResponse().setResultCd("0");
		response.getDocumentResponse().setResultMessage("success");

		return response;
	}

}
