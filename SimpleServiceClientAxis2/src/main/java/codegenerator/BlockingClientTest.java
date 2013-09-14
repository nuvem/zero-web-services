package codegenerator;

import java.rmi.RemoteException;

import com.ttdev.ss.SimpleServiceStub;
import com.ttdev.ss.SimpleServiceStub.ConcatRequest;
import com.ttdev.ss.SimpleServiceStub.ConcatResponse;

public class BlockingClientTest {
	public static void main(String[] args) {
		String endpoing = "http://localhost:8080/axis2/services/SimpleService/";
		
		try {
			SimpleServiceStub serviceStub = new SimpleServiceStub(null, endpoing);
			//The request
			ConcatRequest concatRequest = new ConcatRequest();
			concatRequest.setS1("Hola ");
			concatRequest.setS2("caracola");
			//invokes sync Web service
			ConcatResponse concatResponse = serviceStub.concat(concatRequest);
			System.out.println(concatResponse.getConcatResponse());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
}
