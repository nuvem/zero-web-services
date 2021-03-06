
package com.foo.bizservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.foo.bizservice package. 
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

    private final static QName _InvalidQty_QNAME = new QName("http://www.foo.com/bizService/", "invalidQty");
    private final static QName _InvalidProductId_QNAME = new QName("http://www.foo.com/bizService/", "invalidProductId");
    private final static QName _QueryResponse_QNAME = new QName("http://www.foo.com/bizService/", "queryResponse");
    private final static QName _ProductQuery_QNAME = new QName("http://www.foo.com/bizService/", "productQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.foo.bizservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductQueryComplexType }
     * 
     */
    public ProductQueryComplexType createProductQueryComplexType() {
        return new ProductQueryComplexType();
    }

    /**
     * Create an instance of {@link QueryResponseComplexType }
     * 
     */
    public QueryResponseComplexType createQueryResponseComplexType() {
        return new QueryResponseComplexType();
    }

    /**
     * Create an instance of {@link QueryFault }
     * 
     */
    public QueryFault createQueryFault() {
        return new QueryFault();
    }

    /**
     * Create an instance of {@link ProductQueryComplexType.QueryItem }
     * 
     */
    public ProductQueryComplexType.QueryItem createProductQueryComplexTypeQueryItem() {
        return new ProductQueryComplexType.QueryItem();
    }

    /**
     * Create an instance of {@link QueryResponseComplexType.ProductQueryResult }
     * 
     */
    public QueryResponseComplexType.ProductQueryResult createQueryResponseComplexTypeProductQueryResult() {
        return new QueryResponseComplexType.ProductQueryResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.foo.com/bizService/", name = "invalidQty")
    public JAXBElement<Integer> createInvalidQty(Integer value) {
        return new JAXBElement<Integer>(_InvalidQty_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.foo.com/bizService/", name = "invalidProductId")
    public JAXBElement<String> createInvalidProductId(String value) {
        return new JAXBElement<String>(_InvalidProductId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResponseComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.foo.com/bizService/", name = "queryResponse")
    public JAXBElement<QueryResponseComplexType> createQueryResponse(QueryResponseComplexType value) {
        return new JAXBElement<QueryResponseComplexType>(_QueryResponse_QNAME, QueryResponseComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductQueryComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.foo.com/bizService/", name = "productQuery")
    public JAXBElement<ProductQueryComplexType> createProductQuery(ProductQueryComplexType value) {
        return new JAXBElement<ProductQueryComplexType>(_ProductQuery_QNAME, ProductQueryComplexType.class, null, value);
    }

}
