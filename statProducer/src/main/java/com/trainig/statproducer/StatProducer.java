package com.trainig.statproducer;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-20T15:45:43.341+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://www.trainig.com/StatProducer/", name = "StatProducer")
@XmlSeeAlso({ObjectFactory.class})
public interface StatProducer {

    @Oneway
    @RequestWrapper(localName = "getStatistics", targetNamespace = "http://www.trainig.com/StatProducer/", className = "com.trainig.statproducer.GetStatistics")
    @WebMethod(action = "http://www.trainig.com/StatProducer/getStatistics")
    public void getStatistics(
        @WebParam(name = "param", targetNamespace = "")
        java.lang.String param,
        @WebParam(name = "replyto", targetNamespace = "")
        java.lang.String replyto
    );
}
