package code;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Data;


@Data

@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

	@XmlElement(name = "FirstName")//namespace = "http://www.registar.com")
    private String FirstName;
	
	@XmlElement(name = "Value")
    private Value Value;
}
