package svm.webservice;

import svm.domain.abstraction.DomainFacade;
import svm.domain.abstraction.modelInterfaces.IContest;
import svm.domain.abstraction.modelInterfaces.IContestHasTeam;
import svm.domain.abstraction.modelInterfaces.IMatch;
import svm.domain.abstraction.modelInterfaces.ITeam;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.webservice.dto.ContestDTO;
import svm.webservice.dto.MatchDTO;
import svm.webservice.dto.TeamDTO;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 12.12.12
 */
@WebService()
public class ExportContest {
    private Integer sessionId;

    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

    @WebMethod
    public List<TeamDTO> getListOfTeams() {
        List<TeamDTO> result = new LinkedList<TeamDTO>();
        this.sessionId = DomainFacade.generateSessionId();
        try {
            try {
                for (ITeam team : DomainFacade.getTeamModelDAO().getAll(sessionId)) {
                    result.add(new TeamDTO(team));
                }
            } finally {
                DomainFacade.closeSession(sessionId);
            }
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    @WebMethod
    public List<ContestDTO> getListOfContestsByDate(Date date) {
        List<ContestDTO> result = new LinkedList<ContestDTO>();
        this.sessionId = DomainFacade.generateSessionId();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy.MM.dd");
        String searchDate = fmt.format(date);
        try {
            try {
                for (IContest contest : DomainFacade.getContestModelDAO().getAll(sessionId)) {
                    if (fmt.format(contest.getStart()).equals(searchDate)) {
                        result.add(new ContestDTO(contest));
                    }
                }
            } finally {
                DomainFacade.closeSession(sessionId);
            }
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    @WebMethod
    public List<ContestDTO> getListOfContestsByTeam(Integer team) {
        List<ContestDTO> result = new LinkedList<ContestDTO>();
        this.sessionId = DomainFacade.generateSessionId();
        try {
            ITeam t = DomainFacade.getTeamModelDAO().getByUID(sessionId, team);
            try {
                for (IContestHasTeam c : t.getAllContests()) {
                    result.add(new ContestDTO(c.getContest()));
                }
            } finally {
                DomainFacade.closeSession(sessionId);
            }
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    @WebMethod
    public List<MatchDTO> getListOfMatches(Integer contest) {
        List<MatchDTO> result = new LinkedList<MatchDTO>();
        this.sessionId = DomainFacade.generateSessionId();
        try {
            IContest t = DomainFacade.getContestModelDAO().getByUID(sessionId, contest);
            try {
                for (IMatch match : t.getMatches()) {
                    result.add(new MatchDTO(match));
                }
            } finally {
                DomainFacade.closeSession(sessionId);
            }
        } catch (NoSessionFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}