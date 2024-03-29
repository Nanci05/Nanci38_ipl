
package nanci;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "airlinesserver", targetNamespace = "http://nanci/", wsdlLocation = "http://localhost:8080/chess/chessserver?wsdl")
public class AirlinesServer_Service
    extends Service
{

    private final static URL AIRLINESSERVER_WSDL_LOCATION;
    private final static WebServiceException AIRLINESSERVER_EXCEPTION;
    private final static QName CHESSSERVER_QNAME = new QName("http://nanci/", "airlinesserver");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/airlines/airlinesserver?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AIRLINESSERVER_WSDL_LOCATION = url;
        AIRLINESSERVER_EXCEPTION = e;
    }

    public Airlinesserver_Service() {
        super(__getWsdlLocation(), AIRLINESSERVER_QNAME);
    }

    public Airlinesserver_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns Chessserver
     */
    @WebEndpoint(name = "airlinesserverPort")
    public Airlinesserver getAirlinesserverPort() {
        return super.getPort(new QName("http://nanci/", "airlinesserverPort"), Airlinesserver.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Chessserver
     */
    @WebEndpoint(name = "airlinesserverPort")
    public Airlinesserver getAirlinesserverPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://nanci/", "airlinesserverPort"), Airlinesserver.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AIRLINESSERVER_EXCEPTION!= null) {
            throw AIRLINESSERVER_EXCEPTION;
        }
        return AIRLINESSERVER_WSDL_LOCATION;
    }

}