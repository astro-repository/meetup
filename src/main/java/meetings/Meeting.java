package meetings;

import java.util.ArrayList;

import user.User;

public class Meeting extends MeetingLocation {

	private String title;
	private String description;
	private int attendeesLimit;
	private ArrayList<User> host = new ArrayList<User>();
	private User member;
	private MeetingGroupProposalStatus status = MeetingGroupProposalStatus.INVERIFICATION;

	public ArrayList<User> meetingAttendee 		= new ArrayList<User>();
	public ArrayList<User> meetingNotAttendee 	= new ArrayList<User>();
	public ArrayList<User> meetingWaitlistMember = new ArrayList<User>();

	public Meeting(
			User userId, String title,
			String description, String locationCountryCode,
			int attendeesLimit,  String locationCity
			) {

		super(locationCountryCode, locationCity);

		this.host.add(userId);
		this.member			= userId;
		this.title 			= title;
		this.description 	= description;
		this.attendeesLimit = attendeesLimit;

	}
	
	private void createMeeting() {
		
		if (meetingAttendee.indexOf(this.member) != -1) {
			
		}
		
	}
	
	private void attendeeMeeting(boolean bool) {
		
		if (bool) {
			this.status = MeetingGroupProposalStatus.ACCEPTED;
		}
		this.status = MeetingGroupProposalStatus.REJECTED;
		
//		if (meetingAttendee.size() >= this.attendeesLimit) {
//			
//		}
		
	}
	
	
}
