package codegenerator;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.juanfezero.callbackhandler.SimpleServiceCallbackHandler;

import com.ttdev.ss.SimpleServiceStub;
import com.ttdev.ss.SimpleServiceStub.ConcatRequest;

public class NonBlockingClientTest {

	public static void main(String[] args) {
		ConcatRequest concatRequest = new ConcatRequest();
		concatRequest.setS1("hola ");
		concatRequest.setS2("caracola");
		SimpleServiceCallbackHandler callbackHandler = new SimpleServiceCallbackHandler();

		try {
			SimpleServiceStub stub = new SimpleServiceStub("http://localhost:8080/axis2/services/SimpleService/");
			stub.startconcat(concatRequest, callbackHandler);
			
			long start = System.currentTimeMillis();
			while (callbackHandler.getResponse() == null) {
				System.out.println(callbackHandler.getResponse());
			}
			long end=System.currentTimeMillis();
			
			long timeInSeconds = (end - start);
			
			System.out.println("call duration = " + timeInSeconds);
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(callbackHandler.getResponse().getConcatResponse());

	}
}
