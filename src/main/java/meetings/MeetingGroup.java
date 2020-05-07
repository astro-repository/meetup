package meetings;

import java.util.ArrayList;

public class MeetingGroup {

	private ArrayList<Meeting> meetingGroup;

	public MeetingGroup(ArrayList<Meeting> meeting) {
		this.meetingGroup = meeting;
	}

	public ArrayList<Meeting> getMeeting() {
		return meetingGroup;
	}

	public void setMeeting(ArrayList<Meeting> meeting) {
		this.meetingGroup = meeting;
	}
	
	public void addMeeting(Meeting meeting) {
		this.meetingGroup.add(meeting);
	}
	
}
