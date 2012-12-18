
/**
 * AnnouncementServiceExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.announcement.services;

public class AnnouncementServiceExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355391763999L;
    
    private org.wso2.carbon.announcement.services.AnnouncementServiceException faultMessage;

    
        public AnnouncementServiceExceptionException() {
            super("AnnouncementServiceExceptionException");
        }

        public AnnouncementServiceExceptionException(java.lang.String s) {
           super(s);
        }

        public AnnouncementServiceExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AnnouncementServiceExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.announcement.services.AnnouncementServiceException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.announcement.services.AnnouncementServiceException getFaultMessage(){
       return faultMessage;
    }
}
    