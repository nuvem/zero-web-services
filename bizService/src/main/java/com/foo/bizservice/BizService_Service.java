package com.foo.bizservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-16T22:43:25.227+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "bizService", 
                  wsdlLocation = "file:/C:/zero/REPOS/zero-web-services/bizService/src/main/resources/bizService.wsdl",
                  targetNamespace = "http://www.foo.com/bizService/") 
public class BizService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.foo.com/bizService/", "bizService");
    public final static QName BizServiceSOAP = new QName("http://www.foo.com/bizService/", "bizServiceSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/zero/REPOS/zero-web-services/bizService/src/main/resources/bizService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BizService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/zero/REPOS/zero-web-services/bizService/src/main/resources/bizService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BizService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BizService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BizService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BizService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BizService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BizService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns BizService
     */
    @WebEndpoint(name = "bizServiceSOAP")
    public BizService getBizServiceSOAP() {
        return super.getPort(BizServiceSOAP, BizService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BizService
     */
    @WebEndpoint(name = "bizServiceSOAP")
    public BizService getBizServiceSOAP(WebServiceFeature... features) {
        return super.getPort(BizServiceSOAP, BizService.class, features);
    }

}
