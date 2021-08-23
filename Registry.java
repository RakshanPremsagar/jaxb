package code;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import lombok.Data;

@Data
@XmlRootElement(name="Registry")//,namespace = "http://www.registar.com")
@XmlAccessorType(XmlAccessType.FIELD)

public class Registry {
	
	
	@XmlElement(name="Student")//,namespace = "http://www.registar.com")
	private List<Student> Student;

}
