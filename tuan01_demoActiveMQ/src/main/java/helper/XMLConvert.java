package helper;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLConvert<T> {
	private T type;

	public XMLConvert(T type) {
		super();
		this.type = type;
	}
	
	@SuppressWarnings("unchecked")
	public T xml12Object(String xml) throws JAXBException {
		T sv=null;
		JAXBContext jaxbContext = JAXBContext.newInstance(type.getClass());
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		sv = (T) unmarshaller.unmarshal(new StringReader(xml));
		return sv;
	}
	
	public String object2XML(T obj) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(type.getClass());
		Marshaller marshaller = jaxbContext.createMarshaller();
		StringWriter stringWriter=new StringWriter();
		marshaller.marshal(obj, stringWriter);
		return stringWriter.toString();
	}
}
