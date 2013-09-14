package codegenerator;

import org.apache.axis2.wsdl.WSDL2Code;

public class ClientCodeGenerator {
	public static void main(String[] args) throws Exception {
		WSDL2Code.main(new String[] { "-S", "src/main/java",
				"-R", "src/main/resources/META-INF",  
				"-ns2p",
				"http://ttdev.com/ss=com.ttdev.ss", "-uri",
				"src/main/resources/SimpleService.wsdl" });
		System.out.println("Done!");
	}
}