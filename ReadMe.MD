# GetDocumentService

GetDocumentService is a temporary document retrieval service to replace the existing wMethods, CCD GetDocument.

This project is designed to package a WAR file compatible with JBOSS 6.4 initially. 

## Installation

```bash
mvn clean install
```

## Building 

```bash
mvn package
```

## WSDL Endpoint(s) 

http://localhost:8080/GetDocument/ws/getDocument.wsdl
http://localhost:8080/GetDocument/ws/getDocumentSecure.wsdl

http://sarcee.bcgov:8081/GetDocument/ws/getDocument.wsdl
https://dev.jag.gov.bc.ca/GetDocument/ws/getDocument.wsdl?

## Module Path 

See the 'module' folder for module path placement of **getDocument.properties** and **module.xml** files. 

**Note**: This must be completed before first deployment. 

## Deployment 

After running:
```bash
mvn clean package
```

- WAR file will be located in under target folder. 
- WAR file requires manual deployment for local development. Use Jenkins [task needed here] for DEV/TEST/PROD.

## Oracle Universal Connection Pool

This project uses the Universal Connection Pool which closely mimics the JDBC Adapter settings used by webMethods. 

Connection pools settings are found in the getDocument.properties file. 

Note: This application does not require a JNDI connection made within the JBOSS server. 

More information about Oracle UCP may be found at https://docs.oracle.com/en/database/oracle/oracle-database/21/jjucp/index.html

## Use of the 'Fixed' Wsdl Def classes
See wsdlfix folder. These classes were created to fix an issue whereby the XJC JAXB compiler was unable, 
out of the box, to create exact replicas of the SOAP service request structure from 
the schema extracted from the original WSDL file. These classes fixed that issue. 

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Still to do  
- Complete coding of 'Secure' endpoint.  
- Connect Jenkins deploy task 
- Re-wire existing SSG endpoint(s) 

## Application Status (and version) 
http://localhost:8080/GetDocument/status
http://sarcee.bcgov:8081/GetDocument/status  

## Test Data (DEV)
10969  I   Application to Obtain an Order                       (60M)  
10968  I   Application about Extraordinary Parenting Matter     (37M)  
10966  I   Affidavit                                            (22M)        
10923  I   Recognizance - FMEA                                  (17M)(LL)
10921  I   Restraining Order under Family Maint. Enforcemnt Act (12M)  
10924  I   Restraining Order - FMEA                             (3M)  
10920  I   Application for Enforcement                          (1.6M) 
10854  I   Notice of Claim                                      (198K) 

## Jenkins Logging. 
https://jag.gov.bc.ca/jenkins/job/eCourts/job/eCourts.app.logfiles/ (old)  
https://jag.gov.bc.ca/jenkins/job/CATS/job/cats.app.logfiles/

## Jenkins Deployer
https://jag.gov.bc.ca/jenkins/job/CATS/job/getDocument-promotion-all/  
