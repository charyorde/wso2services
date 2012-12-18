
/**
 * RemoteProfileConfigurationManagerServiceUserStoreExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.um.ws.service;

public class RemoteProfileConfigurationManagerServiceUserStoreExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355395628932L;
    
    private org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException faultMessage;

    
        public RemoteProfileConfigurationManagerServiceUserStoreExceptionException() {
            super("RemoteProfileConfigurationManagerServiceUserStoreExceptionException");
        }

        public RemoteProfileConfigurationManagerServiceUserStoreExceptionException(java.lang.String s) {
           super(s);
        }

        public RemoteProfileConfigurationManagerServiceUserStoreExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RemoteProfileConfigurationManagerServiceUserStoreExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.um.ws.service.RemoteProfileConfigurationManagerServiceUserStoreException getFaultMessage(){
       return faultMessage;
    }
}
    