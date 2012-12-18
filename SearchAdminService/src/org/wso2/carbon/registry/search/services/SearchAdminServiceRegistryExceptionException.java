
/**
 * SearchAdminServiceRegistryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.registry.search.services;

public class SearchAdminServiceRegistryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391262079L;
    
    private org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException faultMessage;

    
        public SearchAdminServiceRegistryExceptionException() {
            super("SearchAdminServiceRegistryExceptionException");
        }

        public SearchAdminServiceRegistryExceptionException(java.lang.String s) {
           super(s);
        }

        public SearchAdminServiceRegistryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public SearchAdminServiceRegistryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.registry.search.services.SearchAdminServiceRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    