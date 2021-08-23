package code;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlValue;

import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Value {
	
	 @XmlElements( value =  {
		 @XmlElement(name="ms:String",type = String.class),
		 @XmlElement(name="ms:Int",type = Integer.class),
		 @XmlElement(name="ms:Byte",type = Byte.class)
	 })
	 private Object value;

}
