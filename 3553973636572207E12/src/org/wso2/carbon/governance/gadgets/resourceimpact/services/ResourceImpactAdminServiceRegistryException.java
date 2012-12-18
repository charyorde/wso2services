
/**
 * ResourceImpactAdminServiceRegistryException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.governance.gadgets.resourceimpact.services;

public class ResourceImpactAdminServiceRegistryException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397363592L;
    
    private axis2.apache.org.xsd.ResourceImpactAdminServiceRegistryException faultMessage;

    
        public ResourceImpactAdminServiceRegistryException() {
            super("ResourceImpactAdminServiceRegistryException");
        }

        public ResourceImpactAdminServiceRegistryException(java.lang.String s) {
           super(s);
        }

        public ResourceImpactAdminServiceRegistryException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ResourceImpactAdminServiceRegistryException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.ResourceImpactAdminServiceRegistryException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.ResourceImpactAdminServiceRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    