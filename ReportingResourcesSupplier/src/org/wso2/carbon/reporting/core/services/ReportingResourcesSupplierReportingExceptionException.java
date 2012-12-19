
/**
 * ReportingResourcesSupplierReportingExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.reporting.core.services;

public class ReportingResourcesSupplierReportingExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397606992L;
    
    private org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException faultMessage;

    
        public ReportingResourcesSupplierReportingExceptionException() {
            super("ReportingResourcesSupplierReportingExceptionException");
        }

        public ReportingResourcesSupplierReportingExceptionException(java.lang.String s) {
           super(s);
        }

        public ReportingResourcesSupplierReportingExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ReportingResourcesSupplierReportingExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException msg){
       faultMessage = msg;
    }
    
    public org.wso2.carbon.reporting.core.services.ReportingResourcesSupplierReportingException getFaultMessage(){
       return faultMessage;
    }
}
    