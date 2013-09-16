
package com.foo.bizservicetwo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.foo.bizservicetwo package. 
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

    private final static QName _QueryResponse_QNAME = new QName("http://www.foo.com/bizServiceTwo/", "queryResponse");
    private final static QName _ProductQuery_QNAME = new QName("http://www.foo.com/bizServiceTwo/", "productQuery");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.foo.bizservicetwo
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
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResponseComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.foo.com/bizServiceTwo/", name = "queryResponse")
    public JAXBElement<QueryResponseComplexType> createQueryResponse(QueryResponseComplexType value) {
        return new JAXBElement<QueryResponseComplexType>(_QueryResponse_QNAME, QueryResponseComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductQueryComplexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.foo.com/bizServiceTwo/", name = "productQuery")
    public JAXBElement<ProductQueryComplexType> createProductQuery(ProductQueryComplexType value) {
        return new JAXBElement<ProductQueryComplexType>(_ProductQuery_QNAME, ProductQueryComplexType.class, null, value);
    }

}
