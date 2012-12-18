
/**
 * GovImpactAnalysisAdminServiceGovernanceException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.governance.gadgets.impactanalysis.services;

public class GovImpactAnalysisAdminServiceGovernanceException extends java.lang.Exception{

    private static final long serialVersionUID = 1355397235985L;
    
    private axis2.apache.org.xsd.GovImpactAnalysisAdminServiceGovernanceException faultMessage;

    
        public GovImpactAnalysisAdminServiceGovernanceException() {
            super("GovImpactAnalysisAdminServiceGovernanceException");
        }

        public GovImpactAnalysisAdminServiceGovernanceException(java.lang.String s) {
           super(s);
        }

        public GovImpactAnalysisAdminServiceGovernanceException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public GovImpactAnalysisAdminServiceGovernanceException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.GovImpactAnalysisAdminServiceGovernanceException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.GovImpactAnalysisAdminServiceGovernanceException getFaultMessage(){
       return faultMessage;
    }
}
    