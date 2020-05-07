package administrator;

import java.util.ArrayList;

import meetings.Meeting;
import meetings.MeetingGroup;
import user.User;

public class Administrator extends User {

	private ArrayList<MeetingGroupProposal> memberProposals;

	public Administrator(String nom, String prenoms) {
		super(nom, prenoms);
	}
	
	public ArrayList<MeetingGroupProposal> getMemberProposals() {
		return memberProposals;
	}

	public void setMemberProposals(ArrayList<MeetingGroupProposal> memberProposals) {
		this.memberProposals = memberProposals;
	}
	
	public void addMemberProposals(MeetingGroupProposal memberProposals) {
		this.memberProposals.add(memberProposals);
	}
	
	

}
