
/**
 * RemoteClaimManagerServiceUserStoreExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.um.ws.service;

public class RemoteClaimManagerServiceUserStoreExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355395596378L;
    
    private org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException faultMessage;

    
        public RemoteClaimManagerServiceUserStoreExceptionException() {
            super("RemoteClaimManagerServiceUserStoreExceptionException");
        }

        public RemoteClaimManagerServiceUserStoreExceptionException(java.lang.String s) {
           super(s);
        }

        public RemoteClaimManagerServiceUserStoreExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RemoteClaimManagerServiceUserStoreExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.um.ws.service.RemoteClaimManagerServiceUserStoreException getFaultMessage(){
       return faultMessage;
    }
}
    