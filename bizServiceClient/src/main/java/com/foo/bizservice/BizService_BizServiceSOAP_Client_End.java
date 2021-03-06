package com.foo.bizservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import com.foo.bizservice.ProductQueryComplexType.QueryItem;

/**
 * This class was generated by Apache CXF 2.7.6 2013-09-16T17:06:56.257+02:00
 * Generated source version: 2.7.6
 * 
 */
public final class BizService_BizServiceSOAP_Client_End {

	private static final QName SERVICE_NAME = new QName(
			"http://www.foo.com/bizService/", "bizService");

	private BizService_BizServiceSOAP_Client_End() {
	}

	public static void main(String args[]) throws java.lang.Exception {
		URL wsdlURL = BizService_Service.WSDL_LOCATION;
		if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
			File wsdlFile = new File(args[0]);
			try {
				if (wsdlFile.exists()) {
					wsdlURL = wsdlFile.toURI().toURL();
				} else {
					wsdlURL = new URL(args[0]);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		BizService_Service ss = new BizService_Service(wsdlURL, SERVICE_NAME);

		BizService port = ss.getBizServiceSOAP();

		BindingProvider provider = (BindingProvider) port;
		provider.getRequestContext().put(
				BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"http://localhost:4321/bizService/");

		// private static void makeModelTest() {
		// ProductItem item1 = new ProductItem("0001", 100, 25);
		// ProductItem item2 = new ProductItem("0002", 150, 32);
		// ProductItem item3 = new ProductItem("0003", 99, 320);
		// ProductItem item4 = new ProductItem("0004", 300, 15);
		// ProductItem item5 = new ProductItem("0005", 254, 25);
		// items.add(item1);
		// items.add(item2);
		// items.add(item3);
		// items.add(item4);
		// items.add(item5);
		//
		// }

		{

			System.out.println("Invoking query...");
			com.foo.bizservice.ProductQueryComplexType _query_parameters = new ProductQueryComplexType();

			QueryItem queryItem1 = new QueryItem();
			queryItem1.setProductId("0001");
//			queryItem1.setProductId("0000ww0w");
			queryItem1.setQty(10);

			QueryItem queryItem2 = new QueryItem();
			queryItem2.setProductId("0005");
			queryItem2.setQty(150);
//			queryItem2.setQty(0);

			// this shouln't be queried
			QueryItem queryItem3 = new QueryItem();
			queryItem3.setProductId("0003");
			queryItem3.setQty(300);

			_query_parameters.getQueryItem().add(queryItem1);
			_query_parameters.getQueryItem().add(queryItem2);
			_query_parameters.getQueryItem().add(queryItem3);

			com.foo.bizservice.QueryResponseComplexType _query__return = port
					.query(_query_parameters);

			System.out.println("query.result=" + _query__return);

		}

		System.exit(0);
	}

}
