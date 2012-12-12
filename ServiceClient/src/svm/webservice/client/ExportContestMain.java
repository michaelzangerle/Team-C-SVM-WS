package svm.webservice.client;

import svm.webservice.client.service.*;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * ProjectTeam: Team C
 * Date: 12.12.12
 */
public class ExportContestMain {
    public static void main(String[] argv) throws ServiceException, RemoteException {
        ExportContestServiceLocator locator = new ExportContestServiceLocator();
        ExportContestServicePortType export = locator.getExportContestServiceHttpSoap11Endpoint();

        Calendar cal = Calendar.getInstance();
        cal.set(2012, Calendar.NOVEMBER, 4);
        ContestDTO[] contests = export.getListOfContestsByDate(cal.getTime());
        if (contests != null) {
            for (ContestDTO contest : contests) {
                System.out.println(contest.getName());
            }
            MatchDTO[] matches = export.getListOfMatches(contests[0].getUID());
            if(matches!=null){
                for (MatchDTO match : matches) {
                    System.out.println(match.getName());
                }
            }
        }
    }
}