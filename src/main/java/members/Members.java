package members;

import administrator.Administrator;
import administrator.MeetingGroupProposal;
import meetings.Meeting;
import meetings.MeetingGroup;
import user.User;

public class Members extends User {

	public Members(String nom, String prenoms) {
		super(nom, prenoms);
	}
	
	public void submitGroupProposition(
			Administrator admin,
			MeetingGroup meetingGroup) {

		admin.addMemberProposals(
				new MeetingGroupProposal(meetingGroup)
		);

	}

}
