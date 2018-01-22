package org.redhat.demo;



public class ClaimResponse {

	
	public MyRestResponse convertSoapBody(ApplyResponse soapresponse) {
		
		MyRestResponse response = new MyRestResponse();
		
		response.setStatus(soapresponse.getReturn().getStatus());
		return response;
	}
}
