package com.sap.persistence.j;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-04-04T13:34:19.983+02:00
 * Generated source version: 3.3.1
 *
 */
@WebServiceClient(name = "Jc",
                  wsdlLocation = "http://i83lp1.informatik.tu-muenchen.de:50000/Jc/Jcus?wsdl",
                  targetNamespace = "http://sap.com/persistence/j/")
public class Jc extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sap.com/persistence/j/", "Jc");
    public final static QName JcusPort = new QName("http://sap.com/persistence/j/", "JcusPort");
    static {
        URL url = null;
        try {
            url = new URL("http://i83lp1.informatik.tu-muenchen.de:50000/Jc/Jcus?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Jc.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://i83lp1.informatik.tu-muenchen.de:50000/Jc/Jcus?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Jc(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Jc(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Jc() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Jc(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Jc(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Jc(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Jcus
     */
    @WebEndpoint(name = "JcusPort")
    public Jcus getJcusPort() {
        return super.getPort(JcusPort, Jcus.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Jcus
     */
    @WebEndpoint(name = "JcusPort")
    public Jcus getJcusPort(WebServiceFeature... features) {
        return super.getPort(JcusPort, Jcus.class, features);
    }

}
