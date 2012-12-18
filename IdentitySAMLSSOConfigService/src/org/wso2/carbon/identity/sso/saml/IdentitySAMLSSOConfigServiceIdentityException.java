
/**
 * IdentitySAMLSSOConfigServiceIdentityException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.identity.sso.saml;

public class IdentitySAMLSSOConfigServiceIdentityException extends java.lang.Exception{

    private static final long serialVersionUID = 1355395767371L;
    
    private axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException faultMessage;

    
        public IdentitySAMLSSOConfigServiceIdentityException() {
            super("IdentitySAMLSSOConfigServiceIdentityException");
        }

        public IdentitySAMLSSOConfigServiceIdentityException(java.lang.String s) {
           super(s);
        }

        public IdentitySAMLSSOConfigServiceIdentityException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public IdentitySAMLSSOConfigServiceIdentityException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.IdentitySAMLSSOConfigServiceIdentityException getFaultMessage(){
       return faultMessage;
    }
}
    