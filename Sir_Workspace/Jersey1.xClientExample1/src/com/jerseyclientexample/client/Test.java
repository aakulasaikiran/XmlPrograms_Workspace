package com.jerseyclientexample.client;

import java.io.StringWriter;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.jerseyclientexample.domain.Product;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class Test {
public static void main(String[] args) throws JAXBException {
Product product=new Product();
product.setPid(102);
product.setPname("LCD");
product.setPrice(12000.0);
//convert into obj into XML by using JAXB API
JAXBContext context=
JAXBContext.newInstance(Product.class);
Marshaller marshaller=context.createMarshaller();
StringWriter writer=new StringWriter();
marshaller.marshal(product,writer);
String productInXML=writer.toString();

//access the Service by using jersey 1.x 
//Required URL: http://localhost:8082/Jersey1.xExample3/products/registerProduct

Client client=Client.create();
String url="http://localhost:8082/Jersey1.xExample3/products/registerProduct";
  WebResource resource=client.resource(url);
 Builder builder=resource.accept(MediaType.TEXT_PLAIN);
  builder.type(MediaType.APPLICATION_XML);
  ClientResponse clientResponse=builder.post(ClientResponse.class,productInXML);
  
  System.out.println(clientResponse.getStatus()+" -->"+clientResponse.getStatusInfo());
  String response=clientResponse.getEntity(String.class);
  System.out.println(response);
	}

}
