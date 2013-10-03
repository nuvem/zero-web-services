package org.juanfezero.simplewebapp.servlet;

import javax.servlet.ServletConfig;
import javax.xml.ws.Endpoint;

import org.apache.cxf.BusFactory;
import org.apache.cxf.transport.servlet.CXFNonSpringServlet;

import com.ttdev.ss.SimpleServiceImpl;

/**
 * Servlet implementation class SimpleServlet
 */
public class SimpleServlet extends CXFNonSpringServlet {
	private static final long serialVersionUID = 1L;
       
//    /**
//     * @see CXFNonSpringServlet#CXFNonSpringServlet()
//     */
//    public SimpleServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//       
//    /**
//     * @see CXFNonSpringServlet#CXFNonSpringServlet(DestinationRegistry)
//     */
//    public SimpleServlet(DestinationRegistry destinationRegistry) {
//        super(destinationRegistry);
//        // TODO Auto-generated constructor stub
//    }
//       
//    /**
//     * @see CXFNonSpringServlet#CXFNonSpringServlet(DestinationRegistry, boolean)
//     */
//    public SimpleServlet(DestinationRegistry destinationRegistry, boolean loadBus) {
//        super(destinationRegistry, loadBus);
//        // TODO Auto-generated constructor stub
//    }
	
	@Override
	protected void loadBus(ServletConfig servletConfig) {
		// TODO Auto-generated method stub
		super.loadBus(servletConfig);
		BusFactory.setDefaultBus(getBus());
		Object implementor = new SimpleServiceImpl();
		Endpoint.publish("/p1", implementor);
		
	}

}
