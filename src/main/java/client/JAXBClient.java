package client;

import mortgageIndexService.MortgageIndexSoap;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by tanya on 31.05.2017.
 */
public class JAXBClient {

    public MortgageIndexSoap mortgageIndexSoap;
    public JAXBClient() {
        try {
            URL url = new URL("http://www.webservicex.net/MortgageIndex.asmx?WSDL");

            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://www.webservicex.net/", "MortgageIndex");

            Service service = Service.create(url, qname);

            mortgageIndexSoap = service.getPort(MortgageIndexSoap.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
