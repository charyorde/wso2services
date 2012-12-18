
/**
 * DataServiceFileUploaderExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.dataservices.core.admin;

public class DataServiceFileUploaderExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394134515L;
    
    private org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException faultMessage;

    
        public DataServiceFileUploaderExceptionException() {
            super("DataServiceFileUploaderExceptionException");
        }

        public DataServiceFileUploaderExceptionException(java.lang.String s) {
           super(s);
        }

        public DataServiceFileUploaderExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public DataServiceFileUploaderExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.dataservices.core.admin.DataServiceFileUploaderException getFaultMessage(){
       return faultMessage;
    }
}
    