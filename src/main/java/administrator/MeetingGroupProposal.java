package administrator;

import meetings.MeetingGroup;

public class MeetingGroupProposal {

	private int attendeesLimit;
	private MeetingGroupProposalStatus status;
	private MeetingGroup meetingGroup;
	
	public MeetingGroupProposal(MeetingGroup meetingGroup) {
		this.meetingGroup = meetingGroup;
		this.status = MeetingGroupProposalStatus.INVERIFICATION;
	}

	public void seeListProposedMembers() {

	}

	public void acceptedMeeting() {
		this.status = MeetingGroupProposalStatus.ACCEPTED;
	}

	public void rejectedMeeting() {
		this.status = MeetingGroupProposalStatus.REJECTED;
	}

}
