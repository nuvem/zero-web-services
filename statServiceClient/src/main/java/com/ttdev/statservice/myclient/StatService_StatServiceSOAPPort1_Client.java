package com.ttdev.statservice.myclient;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

import com.ttdev.statservice.StatService;
import com.ttdev.statservice.StatServicePorts;

/**
 * This class was generated by Apache CXF 2.7.6 2013-09-17T16:42:23.445+02:00
 * Generated source version: 2.7.6
 * 
 */
public final class StatService_StatServiceSOAPPort1_Client {

	private static final QName SERVICE_NAME = new QName(
			"http://ttdev.com/StatService/", "StatServicePorts");

	private StatService_StatServiceSOAPPort1_Client() {
	}

	public static void main(String args[]) throws java.lang.Exception {
		URL wsdlURL = StatServicePorts.WSDL_LOCATION;
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

		StatServicePorts ss = new StatServicePorts(wsdlURL, SERVICE_NAME);
		StatService port = ss.getStatServiceSOAPPort1();

		// {
		// System.out.println("Invoking getStatisticsAsync...");
		// java.lang.String _getStatisticsAsync_parameters = "Hola Caracola";
		//
		// Response<java.lang.String> _getStatisticsAsync__return = port
		// .getStatisticsAsync(_getStatisticsAsync_parameters);
		//
		// System.out.println("getStatisticsAsync.result="
		// + _getStatisticsAsync__return.get());
		//
		// }

		port.getStatisticsAsync("Hola Caracola", new AsyncHandler<String>() {

			@Override
			public void handleResponse(Response<String> res) {
				try {
					System.out.println("Got result:" + res.get());
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				} catch (ExecutionException e) {
					throw new RuntimeException(e);

				}
			}
		});

		System.out.println("Press Enter to quit");
		new BufferedReader(new InputStreamReader(System.in)).readLine();
		// {
		// System.out.println("Invoking getStatisticsAsync...");
		// java.lang.String _getStatisticsAsync_parameters = "";
		// AsyncHandler<java.lang.String> _getStatisticsAsync_asyncHandler =
		// null;
		// Future<?> _getStatisticsAsync__return =
		// port.getStatisticsAsync(_getStatisticsAsync_parameters,
		// _getStatisticsAsync_asyncHandler);
		// System.out.println("getStatisticsAsync.result=" +
		// _getStatisticsAsync__return);
		//
		//
		// }
		// {
		// System.out.println("Invoking getStatistics...");
		// java.lang.String _getStatistics_parameters = "";
		// java.lang.String _getStatistics__return =
		// port.getStatistics(_getStatistics_parameters);
		// System.out.println("getStatistics.result=" + _getStatistics__return);
		//

		// }

		System.exit(0);
	}

}
