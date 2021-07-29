package ca.bc.gov.ag.courts.ccd.model;

import java.math.BigDecimal;

/**
 * 
 * TicketedURLResponse type 
 * 
 * 
 * @author smillar
 *
 */
public final class TicketedURLResponse {

	private BigDecimal statusCd;
	private String ticketedURL; 
	private String respMessage; 
	
    public TicketedURLResponse(){};

    public  TicketedURLResponse(BigDecimal statusCd, String ticketedURL, String respMessage){
    	this.statusCd = statusCd;
        this.ticketedURL = ticketedURL;
        this.respMessage = respMessage; 
    }

	public int getStatusCd() {
		return statusCd.intValue();
	}

	public void setStatusCd(BigDecimal statusCd) {
		this.statusCd = statusCd;
	}

	public String getTicketedURL() {
		return ticketedURL;
	}

	public void setTicketedURL(String ticketedURL) {
		this.ticketedURL = ticketedURL;
	}

	public String getRespMessage() {
		return respMessage;
	}

	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}

}