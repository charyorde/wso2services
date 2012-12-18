
/**
 * CachingAdminServiceCachingComponentExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.caching.service;

public class CachingAdminServiceCachingComponentExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355390981202L;
    
    private org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException faultMessage;

    
        public CachingAdminServiceCachingComponentExceptionException() {
            super("CachingAdminServiceCachingComponentExceptionException");
        }

        public CachingAdminServiceCachingComponentExceptionException(java.lang.String s) {
           super(s);
        }

        public CachingAdminServiceCachingComponentExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CachingAdminServiceCachingComponentExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.caching.service.CachingAdminServiceCachingComponentException getFaultMessage(){
       return faultMessage;
    }
}
    