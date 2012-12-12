/**
 * ExportContestServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package svm.webservice.client.service;

public interface ExportContestServicePortType extends java.rmi.Remote {
    public java.lang.String sayHelloWorldFrom(java.lang.String from) throws java.rmi.RemoteException;
    public svm.webservice.client.service.ContestDTO[] getListOfContestsByDate(java.util.Date date) throws java.rmi.RemoteException;
    public svm.webservice.client.service.MatchDTO[] getListOfMatches(java.lang.Integer contest) throws java.rmi.RemoteException;
    public svm.webservice.client.service.ContestDTO[] getListOfContestsByTeam(java.lang.Integer team) throws java.rmi.RemoteException;
    public svm.webservice.client.service.TeamDTO[] getListOfTeams() throws java.rmi.RemoteException;
}
