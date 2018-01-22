package org.redhat.demo;

import org.apache.camel.Exchange;

public class ClaimRequest {

	
	public void convertSoapBody(Exchange exchange) {
		Apply apply = new Apply();
		ClaimInput input = new ClaimInput();
		apply.setArg0(input);
		
		//exchange.getIn().setHeader(CxfConstants.OPERATION_NAME, "apply");
		//exchange.getIn().setHeader(CxfConstants.OPERATION_NAMESPACE, "http://demo.redhat.org/");
		exchange.getIn().setBody(apply);
		
	}
}
