package meetings;

import java.util.ArrayList;
import java.util.HashMap;

import user.User;

public class Meeting extends MeetingLocation implements MeetingInterface {
	
	private String 	title;
	private String 	description;
	private int 	attendeesLimit;
	private User 	member;
	
	
	private HashMap<Meeting, ArrayList<User>> meetingNotAttendee 		= new HashMap<Meeting, ArrayList<User>>();
	private HashMap<Meeting, ArrayList<User>> meetingAttendeeList 		= new HashMap<Meeting, ArrayList<User>>();
	private HashMap<Meeting, ArrayList<User>> meetingWaitingList 		= new HashMap<Meeting, ArrayList<User>>();

	
	public Meeting(
			User userId, String title,
			String description, int attendeesLimit,
			String locationCity
			) {
		
		super(locationCity);
		this.member			= userId;
		this.title 			= title;
		this.description 	= description;
		this.attendeesLimit = attendeesLimit;
		
	}
	
	public void proposeGroup(int meetId, 
			ArrayList<User> mAttendee, ArrayList<User> mNotAttendee, 
			ArrayList<User> mWaitlistMember) {
		
		if (
				mAttendee.size()<this.attendeesLimit && 
				mNotAttendee.size()<this.attendeesLimit && 
				mWaitlistMember.size()<this.attendeesLimit
				) {
			
			this.meetingAttendeeList.put(this, mAttendee);
			this.meetingNotAttendee.put(this, mNotAttendee);
			this.meetingWaitingList.put(this, mWaitlistMember);
			
		}
		
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

	public HashMap<Meeting, ArrayList<User>> getMeetingNotAttendee() {
		return meetingNotAttendee;
	}

	public void setMeetingNotAttendee(HashMap<Meeting, ArrayList<User>> meetingNotAttendee) {
		this.meetingNotAttendee = meetingNotAttendee;
	}

	public HashMap<Meeting, ArrayList<User>> getMeetingAttendeeList() {
		return meetingAttendeeList;
	}

	public void setMeetingAttendeeList(HashMap<Meeting, ArrayList<User>> meetingAttendeeList) {
		this.meetingAttendeeList = meetingAttendeeList;
	}

	public HashMap<Meeting, ArrayList<User>> getMeetingWaitingList() {
		return meetingWaitingList;
	}

	public void setMeetingWaitingList(HashMap<Meeting, ArrayList<User>> meetingWaitingList) {
		this.meetingWaitingList = meetingWaitingList;
	}

		
	
}
