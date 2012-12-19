
/**
 * ReportingResourcesSupplierXMLStreamExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.reporting.core.services;

public class ReportingResourcesSupplierXMLStreamExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397606999L;
    
    private org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierXMLStreamException faultMessage;

    
        public ReportingResourcesSupplierXMLStreamExceptionException() {
            super("ReportingResourcesSupplierXMLStreamExceptionException");
        }

        public ReportingResourcesSupplierXMLStreamExceptionException(java.lang.String s) {
           super(s);
        }

        public ReportingResourcesSupplierXMLStreamExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ReportingResourcesSupplierXMLStreamExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierXMLStreamException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierXMLStreamException getFaultMessage(){
       return faultMessage;
    }
}
    