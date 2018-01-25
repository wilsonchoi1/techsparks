package org.redhat.demo;

import java.util.HashMap;

import org.apache.camel.Exchange;

public class MyClaimProcessor {
	
	public void convertSoapBody(Exchange exchange) {
		
		System.out.println(exchange.getIn().getBody());
		
		HashMap map = (HashMap)exchange.getIn().getBody();
		
		/**map.forEach((key,value) -> {
		    System.out.println(key + " -> " + value);
		});**/
		
		ClaimInput claimImput = new ClaimInput();
		claimImput.setApplyItem(1);
		claimImput.setClaimType((Integer) map.get("type"));
		claimImput.setClaimDate( (String) map.get("date"));
		claimImput.setContactPhone((String) map.get("phone"));
		claimImput.setCustomerName((String) map.get("contactName"));
		claimImput.setEmail((String) map.get("email"));
		
		//exchange.getIn().setHeader(CxfConstants.OPERATION_NAME, "apply");
		//exchange.getIn().setHeader(CxfConstants.OPERATION_NAMESPACE, "http://demo.redhat.org/");
		exchange.getIn().setBody(claimImput);
	
	}

}
