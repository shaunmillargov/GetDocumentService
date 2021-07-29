# GetDocumentService

GetDocumentService provides a template for creating SOAP based services from wMethods.


## Installation

```bash
mvn clean install
```

## Building (incuding XJC JAXB artifacts)

```bash
mvn package
```

## Run

```bash
mvn spring-boot:run
```

## WSDL Endpoint(s) 

http://localhost:8083/GetDocument/ws/getDocument.wsdl
http://localhost:8083/GetDocument/ws/getDocumentSecure.wsdl

## Use of the 'Fixed' Wsdl Def classes
See wsdlfix folder. These classes were created to fix an issue whereby the XJC JAXB compiler was unable, 
out of the box, to create exact replicas of the SOAP service request structure from 
the schema extracted from the original WSDL file. These classes fixed that issue. 

