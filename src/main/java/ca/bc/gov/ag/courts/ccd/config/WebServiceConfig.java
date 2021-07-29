package ca.bc.gov.ag.courts.ccd.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import ca.bc.gov.ag.courts.ccd.utils.CCDwsConstants;

/**
 * Web Service Config adapter. 
 * 
 * Note: Requires a separate config per WSDL. 
 * 
 * @author smillar
 *
 */

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(servlet, "/ws/*");
	}
	
	@Bean(name = "getDocument")
	public Wsdl11Definition  defaultWsdl11Definition(XsdSchema getDocumentSchema) {
		
		//Note the use of the 'Fixed' Wsdl11Def class'. This is required to provide the 'like for like' 
		//request structure used by wMethods originally.  
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		
		wsdl11Definition.setPortTypeName("GetDocumentPort");
		wsdl11Definition.setCreateSoap12Binding(true);
		wsdl11Definition.setLocationUri("/ws");
	
		wsdl11Definition.setTargetNamespace(CCDwsConstants.NAMESPACE_URI);
		wsdl11Definition.setSchema(getDocumentSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema getDocumentSchema() {
		return new SimpleXsdSchema(new ClassPathResource("getDocument.xsd"));
	}
	
	@Bean(name = "getDocumentSecure")
	public Wsdl11Definition  defaultWsdl11DefinitionSecure(XsdSchema getDocumentSecureSchema) {
		
		//Note the use of the 'Fixed' Wsdl11Def class'. This is required to provide the 'like for like' 
		//request structure used by wMethods originally.  
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		
		wsdl11Definition.setPortTypeName("GetDocumentSecurePort");
		wsdl11Definition.setCreateSoap12Binding(true);
		wsdl11Definition.setLocationUri("/ws");
		
		wsdl11Definition.setTargetNamespace(CCDwsConstants.NAMESPACE_URI_SECURE);
		wsdl11Definition.setSchema(getDocumentSecureSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema getDocumentSecureSchema() {
		return new SimpleXsdSchema(new ClassPathResource("getDocumentSecure.xsd"));
	}
	
	//This bean must be included for Soap 1.2
	@Bean
	public SaajSoapMessageFactory messageFactory() {
	       SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
	       messageFactory.setSoapVersion(SoapVersion.SOAP_12);
	       return messageFactory;
	}
}
