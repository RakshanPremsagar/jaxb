package code;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.FactoryConfigurationError;

public class Mainparser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {


			File xmlFile = new File("MultipleNS.xml");
			JAXBContext jaxbContext;
			jaxbContext = JAXBContext.newInstance(Registry.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Registry xmlentries = (Registry) jaxbUnmarshaller.unmarshal(xmlFile);


			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(xmlentries, System.out);

		}catch (JAXBException e) {
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
