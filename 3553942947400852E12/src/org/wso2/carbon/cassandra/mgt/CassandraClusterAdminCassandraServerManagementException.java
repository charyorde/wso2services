
/**
 * CassandraClusterAdminCassandraServerManagementException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1-wso2v1  Built on : Jun 24, 2011 (06:41:37 IST)
 */

package org.wso2.carbon.cassandra.mgt;

public class CassandraClusterAdminCassandraServerManagementException extends java.lang.Exception{

    private static final long serialVersionUID = 1355394294703L;
    
    private axis2.apache.org.xsd.CassandraClusterAdminCassandraServerManagementException faultMessage;

    
        public CassandraClusterAdminCassandraServerManagementException() {
            super("CassandraClusterAdminCassandraServerManagementException");
        }

        public CassandraClusterAdminCassandraServerManagementException(java.lang.String s) {
           super(s);
        }

        public CassandraClusterAdminCassandraServerManagementException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CassandraClusterAdminCassandraServerManagementException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(axis2.apache.org.xsd.CassandraClusterAdminCassandraServerManagementException msg){
       faultMessage = msg;
    }
    
    public axis2.apache.org.xsd.CassandraClusterAdminCassandraServerManagementException getFaultMessage(){
       return faultMessage;
    }
}
    