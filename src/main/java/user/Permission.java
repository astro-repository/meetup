package user;

import java.util.ArrayList;

public class Permission {

	private ArrayList<EnumPermission> memberStatus;

	public void isAdministrator() {
		this.memberStatus.add(EnumPermission.Administrator);
	}

	public void isMember() {
		this.memberStatus.add(EnumPermission.Member);
	}
	
	public void isPayer() {
		this.memberStatus.add(EnumPermission.Payer);
	}

	public ArrayList<EnumPermission> getMemberStatus() {
		return memberStatus;
	}

}
