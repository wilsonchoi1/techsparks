
package org.redhat.demo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.redhat.demo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Apply_QNAME = new QName("http://demo.redhat.org/", "apply");
    private final static QName _ApplyResponse_QNAME = new QName("http://demo.redhat.org/", "applyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.redhat.demo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Apply }
     * 
     */
    public Apply createApply() {
        return new Apply();
    }

    /**
     * Create an instance of {@link ApplyResponse }
     * 
     */
    public ApplyResponse createApplyResponse() {
        return new ApplyResponse();
    }

    /**
     * Create an instance of {@link ClaimInput }
     * 
     */
    public ClaimInput createClaimInput() {
        return new ClaimInput();
    }

    /**
     * Create an instance of {@link ClaimOutput }
     * 
     */
    public ClaimOutput createClaimOutput() {
        return new ClaimOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Apply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.redhat.org/", name = "apply")
    public JAXBElement<Apply> createApply(Apply value) {
        return new JAXBElement<Apply>(_Apply_QNAME, Apply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://demo.redhat.org/", name = "applyResponse")
    public JAXBElement<ApplyResponse> createApplyResponse(ApplyResponse value) {
        return new JAXBElement<ApplyResponse>(_ApplyResponse_QNAME, ApplyResponse.class, null, value);
    }

}
