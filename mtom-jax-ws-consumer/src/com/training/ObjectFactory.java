
package com.training;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.training package. 
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

    private final static QName _SendImageResponse_QNAME = new QName("http://ifaces.training.com/", "sendImageResponse");
    private final static QName _GetImage_QNAME = new QName("http://ifaces.training.com/", "getImage");
    private final static QName _SendImage_QNAME = new QName("http://ifaces.training.com/", "sendImage");
    private final static QName _GetImageResponse_QNAME = new QName("http://ifaces.training.com/", "getImageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.training
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetImageResponse }
     * 
     */
    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    /**
     * Create an instance of {@link GetImage }
     * 
     */
    public GetImage createGetImage() {
        return new GetImage();
    }

    /**
     * Create an instance of {@link SendImage }
     * 
     */
    public SendImage createSendImage() {
        return new SendImage();
    }

    /**
     * Create an instance of {@link SendImageResponse }
     * 
     */
    public SendImageResponse createSendImageResponse() {
        return new SendImageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "sendImageResponse")
    public JAXBElement<SendImageResponse> createSendImageResponse(SendImageResponse value) {
        return new JAXBElement<SendImageResponse>(_SendImageResponse_QNAME, SendImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "getImage")
    public JAXBElement<GetImage> createGetImage(GetImage value) {
        return new JAXBElement<GetImage>(_GetImage_QNAME, GetImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "sendImage")
    public JAXBElement<SendImage> createSendImage(SendImage value) {
        return new JAXBElement<SendImage>(_SendImage_QNAME, SendImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ifaces.training.com/", name = "getImageResponse")
    public JAXBElement<GetImageResponse> createGetImageResponse(GetImageResponse value) {
        return new JAXBElement<GetImageResponse>(_GetImageResponse_QNAME, GetImageResponse.class, null, value);
    }

}
