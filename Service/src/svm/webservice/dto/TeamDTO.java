/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package svm.webservice.dto;

import svm.domain.abstraction.modelInterfaces.ITeam;

/**
 * @author Administrator
 */
public class TeamDTO extends DTO<ITeam> {

    private String name;
    private MemberDTO contactPerson;

    public MemberDTO getContactPerson() {
        return contactPerson;
    }

    public String getName() {
        return name;
    }

    public TeamDTO(ITeam m) {
        super(m);
        doUpdate(m);
    }

    @Override
    protected void doUpdate(ITeam m) {
        this.name = m.getName();
        this.contactPerson = new MemberDTO(m.getContactPerson());
    }

    @Override
    public String toString() {
        return getName();
    }
}
