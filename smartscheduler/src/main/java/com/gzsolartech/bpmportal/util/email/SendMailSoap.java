
package com.gzsolartech.bpmportal.util.email;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SendMailSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SendMailSoap {


    /**
     * 
     * @param strMailCC
     * @param strCredentialAccount
     * @param strMailTo
     * @param sendMailForEIPResult
     * @param strErrorMsg
     * @param strMailBcc
     * @param strCredentialPwd
     * @param strMailBody
     * @param strMailFrom
     * @param strMailSubject
     */
    @WebMethod(operationName = "SendMailForEIP", action = "http://tempuri.org/SendMailForEIP")
    @RequestWrapper(localName = "SendMailForEIP", targetNamespace = "http://tempuri.org/", className = "com.gzsolartech.bpmportal.util.email.SendMailForEIP")
    @ResponseWrapper(localName = "SendMailForEIPResponse", targetNamespace = "http://tempuri.org/", className = "com.gzsolartech.bpmportal.util.email.SendMailForEIPResponse")
    public void sendMailForEIP(
        @WebParam(name = "strMailFrom", targetNamespace = "http://tempuri.org/")
        String strMailFrom,
        @WebParam(name = "strMailTo", targetNamespace = "http://tempuri.org/")
        String strMailTo,
        @WebParam(name = "strMailSubject", targetNamespace = "http://tempuri.org/")
        String strMailSubject,
        @WebParam(name = "strMailBody", targetNamespace = "http://tempuri.org/")
        String strMailBody,
        @WebParam(name = "strCredentialAccount", targetNamespace = "http://tempuri.org/")
        String strCredentialAccount,
        @WebParam(name = "strCredentialPwd", targetNamespace = "http://tempuri.org/")
        String strCredentialPwd,
        @WebParam(name = "strMailCC", targetNamespace = "http://tempuri.org/")
        String strMailCC,
        @WebParam(name = "strMailBcc", targetNamespace = "http://tempuri.org/")
        String strMailBcc,
        @WebParam(name = "SendMailForEIPResult", targetNamespace = "http://tempuri.org/", mode = WebParam.Mode.OUT)
        Holder<Boolean> sendMailForEIPResult,
        @WebParam(name = "strErrorMsg", targetNamespace = "http://tempuri.org/", mode = WebParam.Mode.OUT)
        Holder<String> strErrorMsg);

}
