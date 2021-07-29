package ca.bc.gov.ag.courts.ccd.model;

import java.math.BigDecimal;

/**
 * 
 * ValidateUserResponse type 
 * 
 * 
 * @author smillar
 *
 */
public final class ValidateUserResponse {

	private BigDecimal respCd;
	private String respMessage; 
	
    public ValidateUserResponse(){};

    public  ValidateUserResponse(BigDecimal respCd, String respMessage){
    	this.respCd = respCd;
        this.respMessage = respMessage; 
    }

	public int getRespCd() {
		return this.respCd.intValue();
	}

	public void setRespCd(BigDecimal respCd) {
		this.respCd = respCd;
	}

	public String getRespMessage() {
		return respMessage;
	}

	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}

}