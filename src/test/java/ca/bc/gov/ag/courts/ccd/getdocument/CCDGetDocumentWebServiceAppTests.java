package ca.bc.gov.ag.courts.ccd.getdocument;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//Note this test is not run as we are not starting the spring boot Tomcat server.   

@SpringBootTest
public class CCDGetDocumentWebServiceAppTests {

	@Test
	public void contextLoads() {
		System.out.println("Context loaded...");
		Assertions.assertTrue(true);
	}

}
