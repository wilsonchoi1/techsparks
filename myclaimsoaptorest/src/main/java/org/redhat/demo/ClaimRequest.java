package org.redhat.demo;

import java.util.LinkedHashMap;

import org.apache.camel.Exchange;

public class ClaimRequest {

	
	public void convertSoapBody(Exchange exchange) {
		Apply apply = new Apply();
		
		
		LinkedHashMap<String, Object> map = (LinkedHashMap<String, Object>)exchange.getIn().getBody();
		
		/**map.forEach((key,value) -> {
		    System.out.println(key + " -> " + value);
		});**/
		ClaimInput input = new ClaimInput();
		input.setApplyItem((Integer) map.get("applyItem"));
		input.setClaimDate((String)map.get("claimDate"));
		input.setClaimType((Integer)map.get("claimType"));
		input.setContactPhone((String)map.get("contactPhone"));
		input.setCustomerId((String)map.get("customerId"));
		input.setCustomerName((String)map.get("customerName"));
		input.setEmail((String)map.get("email"));
		input.setPolno((String)map.get("polno"));
		//System.out.println("bodyStringOut----->"+bodyStringOut);
		
		
		apply.setArg0(input);
		
		//exchange.getIn().setHeader(CxfConstants.OPERATION_NAME, "apply");
		//exchange.getIn().setHeader(CxfConstants.OPERATION_NAMESPACE, "http://demo.redhat.org/");
		exchange.getIn().setBody(apply);
	
	}
}
