
package mortgageIndexService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;


/**
 * <p><br>This Web service Provides monthly ,weekly and Historical Mortgage Indexes.<br>There are many possible ARM indexes. Each one has distinct market characteristics and fluctuates differently.<br> <UL><LI>Constant Maturity Treasury (CMT) <br><LI>Treasury Bill (T-Bill) <br><LI>12-Month Treasury Average (MTA) <LI>Cost of Deposits Index (CODI) <LI>11th District Cost of Funds Index (COFI) <LI>Cost of Savings Index (COSI) <LI>London Inter Bank Offering Rates (LIBOR) <LI>Certificates of Deposit (CD) Indexes <LI>Prime Rate <LI>Fannie Mae's Required Net Yield (RNY) </UL></p>
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "MortgageIndex", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/MortgageIndex.asmx?WSDL")
public class MortgageIndex
    extends Service
{

    private final static URL MORTGAGEINDEX_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(MortgageIndex.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = MortgageIndex.class.getResource(".");
            url = new URL(baseUrl, "http://www.webservicex.net/MortgageIndex.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://www.webservicex.net/MortgageIndex.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        MORTGAGEINDEX_WSDL_LOCATION = url;
    }

    public MortgageIndex(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MortgageIndex() {
        super(MORTGAGEINDEX_WSDL_LOCATION, new QName("http://www.webserviceX.NET/", "MortgageIndex"));
    }

    /**
     * 
     * @return
     *     returns MortgageIndexSoap
     */
    @WebEndpoint(name = "MortgageIndexSoap")
    public MortgageIndexSoap getMortgageIndexSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "MortgageIndexSoap"), MortgageIndexSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MortgageIndexSoap
     */
    @WebEndpoint(name = "MortgageIndexSoap")
    public MortgageIndexSoap getMortgageIndexSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "MortgageIndexSoap"), MortgageIndexSoap.class, features);
    }

}