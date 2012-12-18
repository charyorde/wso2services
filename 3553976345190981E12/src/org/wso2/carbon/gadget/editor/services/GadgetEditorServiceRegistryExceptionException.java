
/**
 * GadgetEditorServiceRegistryExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.gadget.editor.services;

public class GadgetEditorServiceRegistryExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397634491L;
    
    private org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException faultMessage;

    
        public GadgetEditorServiceRegistryExceptionException() {
            super("GadgetEditorServiceRegistryExceptionException");
        }

        public GadgetEditorServiceRegistryExceptionException(java.lang.String s) {
           super(s);
        }

        public GadgetEditorServiceRegistryExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GadgetEditorServiceRegistryExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.gadget.editor.services.GadgetEditorServiceRegistryException getFaultMessage(){
       return faultMessage;
    }
}
    