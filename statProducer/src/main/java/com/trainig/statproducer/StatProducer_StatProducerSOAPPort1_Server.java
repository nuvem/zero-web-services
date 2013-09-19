
package com.trainig.statproducer;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2013-09-19T17:05:06.868+02:00
 * Generated source version: 2.7.6
 * 
 */
 
public class StatProducer_StatProducerSOAPPort1_Server{

    protected StatProducer_StatProducerSOAPPort1_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new StatProducerImpl();
        String address = "http://localhost:8080/statProducer/port1";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new StatProducer_StatProducerSOAPPort1_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
