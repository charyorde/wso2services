
/**
 * RSSManagerAdminServiceRSSDAOExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.adminconsole.core.admin;

public class RSSManagerAdminServiceRSSDAOExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394185108L;
    
    private org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException faultMessage;

    
        public RSSManagerAdminServiceRSSDAOExceptionException() {
            super("RSSManagerAdminServiceRSSDAOExceptionException");
        }

        public RSSManagerAdminServiceRSSDAOExceptionException(java.lang.String s) {
           super(s);
        }

        public RSSManagerAdminServiceRSSDAOExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public RSSManagerAdminServiceRSSDAOExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.adminconsole.core.admin.RSSManagerAdminServiceRSSDAOException getFaultMessage(){
       return faultMessage;
    }
}
    