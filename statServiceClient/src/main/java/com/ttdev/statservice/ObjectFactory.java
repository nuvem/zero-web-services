
package com.ttdev.statservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ttdev.statservice package. 
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

    private final static QName _GetStatisticsResponse_QNAME = new QName("http://ttdev.com/StatService/", "getStatisticsResponse");
    private final static QName _GetStatistics_QNAME = new QName("http://ttdev.com/StatService/", "getStatistics");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ttdev.statservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttdev.com/StatService/", name = "getStatisticsResponse")
    public JAXBElement<String> createGetStatisticsResponse(String value) {
        return new JAXBElement<String>(_GetStatisticsResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttdev.com/StatService/", name = "getStatistics")
    public JAXBElement<String> createGetStatistics(String value) {
        return new JAXBElement<String>(_GetStatistics_QNAME, String.class, null, value);
    }

}
