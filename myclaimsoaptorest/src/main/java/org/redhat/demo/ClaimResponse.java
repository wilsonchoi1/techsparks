package org.redhat.demo;

import org.apache.camel.Exchange;

public class ClaimResponse {

	
	public void convertSoapBody(Exchange exchange) {
		
		System.out.println(exchange.getIn().getBody());
		//exchange.getIn().setBody("{\"status\":'ok'}");
		
	}
}
