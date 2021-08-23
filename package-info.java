@XmlSchema(
    
    namespace="http://www.registar.com",
    xmlns={
            @XmlNs(prefix = "",namespaceURI = "http://www.registar.com"),
            @XmlNs(prefix = "ms",namespaceURI = "http://www.registar.com/ScoreVariant")
    },
    
    elementFormDefault=XmlNsForm.QUALIFIED
)
package code;





import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;