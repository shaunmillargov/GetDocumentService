
package ca.bc.gov.ag.courts.ccd.getdocument;

/**
 * 
 * @author smillar
 * 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
 
@ComponentScan(basePackages="ca.bc.gov.ag.courts.ccd")
@SpringBootApplication
public class CCDGetDocumentWebServiceApp {
	
	public static void main(String[] args) {
        SpringApplication.run(CCDGetDocumentWebServiceApp.class, args);
    }

}

