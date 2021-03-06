
package com.sap.persistence.j;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2019-04-04T13:34:19.921+02:00
 * Generated source version: 3.3.1
 *
 */
public final class Jcus_JcusPort_Client {

    private static final QName SERVICE_NAME = new QName("http://sap.com/persistence/j/", "Jc");

    private Jcus_JcusPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Jc.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        Jc ss = new Jc(wsdlURL, SERVICE_NAME);
        Jcus port = ss.getJcusPort();

        {
        System.out.println("Invoking findAllCUSTOMER...");
        java.util.List<com.sap.persistence.j.Customer> _findAllCUSTOMER__return = port.findAllCUSTOMER();
        System.out.println("findAllCUSTOMER.result=" + _findAllCUSTOMER__return);


        }
        {
        System.out.println("Invoking findCUSTOMERByCusId...");
        java.lang.Integer _findCUSTOMERByCusId_cusId = Integer.valueOf(540943394);
        java.util.List<com.sap.persistence.j.Customer> _findCUSTOMERByCusId__return = port.findCUSTOMERByCusId(_findCUSTOMERByCusId_cusId);
        System.out.println("findCUSTOMERByCusId.result=" + _findCUSTOMERByCusId__return);


        }
        {
        System.out.println("Invoking delete...");
        com.sap.persistence.j.Customer _delete_entity = new com.sap.persistence.j.Customer();
        _delete_entity.setAddress("Address-1898351991");
        _delete_entity.setCountry("Country49263171");
        _delete_entity.setCusId(Integer.valueOf(-1981387173));
        _delete_entity.setName("Name-582908853");
        port.delete(_delete_entity);


        }
        {
        System.out.println("Invoking create...");
        com.sap.persistence.j.Customer _create_entity = new com.sap.persistence.j.Customer();
        _create_entity.setAddress("Address1480701519");
        _create_entity.setCountry("Country-1721707513");
        _create_entity.setCusId(Integer.valueOf(249128570));
        _create_entity.setName("Name1296381049");
        port.create(_create_entity);


        }
        {
        System.out.println("Invoking update...");
        com.sap.persistence.j.Customer _update_entity = new com.sap.persistence.j.Customer();
        _update_entity.setAddress("Address176033435");
        _update_entity.setCountry("Country-1637710341");
        _update_entity.setCusId(Integer.valueOf(537510005));
        _update_entity.setName("Name-120897885");
        port.update(_update_entity);


        }
        {
        System.out.println("Invoking getCUSTOMERItemCount...");
        int _getCUSTOMERItemCount__return = port.getCUSTOMERItemCount();
        System.out.println("getCUSTOMERItemCount.result=" + _getCUSTOMERItemCount__return);


        }

        System.exit(0);
    }

}
