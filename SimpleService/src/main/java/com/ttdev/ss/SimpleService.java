package com.ttdev.ss;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-12T16:48:06.385+02:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://ttdev.com/ss", name = "SimpleService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SimpleService {

    @WebResult(name = "concatResponse", targetNamespace = "http://ttdev.com/ss", partName = "concatResponse")
    @WebMethod(action = "http://ttdev.com/ss/concat")
    public java.lang.String concat(
        @WebParam(partName = "concatRequest", name = "concatRequest", targetNamespace = "http://ttdev.com/ss")
        ConcatRequest concatRequest
    );
}
