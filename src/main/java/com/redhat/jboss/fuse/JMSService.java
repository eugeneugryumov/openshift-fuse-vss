/**
 * 
 */
package com.redhat.jboss.fuse;

import javax.annotation.Resource;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;


public class JMSService {
	/**
	 * 
	 */

	@Resource(name = "java:jboss/camel/context/spring-context")
	private CamelContext camelContext;

	protected String getHelloName( String name){
        ProducerTemplate producer = camelContext.createProducerTemplate();
        String result = producer.requestBody("direct:start", name, String.class);
    	System.out.print(result);
    	return result;
    }
}
