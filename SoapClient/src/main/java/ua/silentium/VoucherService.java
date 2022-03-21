
package ua.silentium;

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
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VoucherService", targetNamespace = "http://silentium.ua", wsdlLocation = "http://localhost:9697/SoapService/services/VoucherServicePort?wsdl")
public class VoucherService
    extends Service
{

    private final static URL VOUCHERSERVICE_WSDL_LOCATION;
    private final static WebServiceException VOUCHERSERVICE_EXCEPTION;
    private final static QName VOUCHERSERVICE_QNAME = new QName("http://silentium.ua", "VoucherService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9697/SoapService/services/VoucherServicePort?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VOUCHERSERVICE_WSDL_LOCATION = url;
        VOUCHERSERVICE_EXCEPTION = e;
    }

    public VoucherService() {
        super(__getWsdlLocation(), VOUCHERSERVICE_QNAME);
    }

    public VoucherService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VOUCHERSERVICE_QNAME, features);
    }

    public VoucherService(URL wsdlLocation) {
        super(wsdlLocation, VOUCHERSERVICE_QNAME);
    }

    public VoucherService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VOUCHERSERVICE_QNAME, features);
    }

    public VoucherService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VoucherService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VoucherWebServiceSEI
     */
    @WebEndpoint(name = "VoucherServicePort")
    public VoucherWebServiceSEI getVoucherServicePort() {
        return super.getPort(new QName("http://silentium.ua", "VoucherServicePort"), VoucherWebServiceSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VoucherWebServiceSEI
     */
    @WebEndpoint(name = "VoucherServicePort")
    public VoucherWebServiceSEI getVoucherServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://silentium.ua", "VoucherServicePort"), VoucherWebServiceSEI.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VOUCHERSERVICE_EXCEPTION!= null) {
            throw VOUCHERSERVICE_EXCEPTION;
        }
        return VOUCHERSERVICE_WSDL_LOCATION;
    }

}