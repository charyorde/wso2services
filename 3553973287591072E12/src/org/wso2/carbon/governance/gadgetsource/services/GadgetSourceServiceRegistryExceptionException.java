
/**
 * GadgetSourceServiceRegistryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.governance.gadgetsource.services;

public class GadgetSourceServiceRegistryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397328710L;
    
    private org.wso2.carbon.governance.gadgetsource.services.GadgetSourceServiceRegistryException faultMessage;

    
        public GadgetSourceServiceRegistryExceptionException() {
            super("GadgetSourceServiceRegistryExceptionException");
        }

        public GadgetSourceServiceRegistryExceptionException(java.lang.String s) {
           super(s);
        }

        public GadgetSourceServiceRegistryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GadgetSourceServiceRegistryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.governance.gadgetsource.services.GadgetSourceServiceRegistryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.governance.gadgetsource.services.GadgetSourceServiceRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    