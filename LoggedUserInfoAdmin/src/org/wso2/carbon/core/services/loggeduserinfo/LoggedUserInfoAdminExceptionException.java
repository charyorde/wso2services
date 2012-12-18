
/**
 * LoggedUserInfoAdminExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.core.services.loggeduserinfo;

public class LoggedUserInfoAdminExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355389771049L;
    
    private org.wso2.carbon.core.services.loggeduserinfo.LoggedUserInfoAdminException faultMessage;

    
        public LoggedUserInfoAdminExceptionException() {
            super("LoggedUserInfoAdminExceptionException");
        }

        public LoggedUserInfoAdminExceptionException(java.lang.String s) {
           super(s);
        }

        public LoggedUserInfoAdminExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public LoggedUserInfoAdminExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.core.services.loggeduserinfo.LoggedUserInfoAdminException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.core.services.loggeduserinfo.LoggedUserInfoAdminException getFaultMessage(){
       return faultMessage;
    }
}
    