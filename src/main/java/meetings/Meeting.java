package meetings;

import administrator.MeetingGroupProposalDecision;
import administrator.MeetingGroupProposalStatus;
import user.User;

public class Meeting {

	private String 	title;
	private String 	description;
	private int 	attendeesLimit;
	private User 	member;

	private MeetingNotAttendee 		meetingNotAttendee;
	private MeetingAttendee 		meetingAttendee;
	private MeetingWaitlistMember 	meetingWaitlistMember;
	
	public MeetingLocation location;
	public MeetingGroupProposalDecision decision;
	
	public Meeting(
			User userId, String title,
			String description, int attendeesLimit,
			String locationCity
			) {

		this.member			= userId;
		this.title 			= title;
		this.description 	= description;
		this.location 		= new MeetingLocation(locationCity);

	}
	
	public MeetingGroupProposalDecision getDecision() {
		return decision;
	}

	public void setDecision(MeetingGroupProposalDecision decision) {
		this.decision = decision;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAttendeesLimit() {
		return this.attendeesLimit;
	}

	public void setAttendeesLimit(int attendeesLimit) {
		this.attendeesLimit = attendeesLimit;
	}

	public User getMember() {
		return member;
	}

}
