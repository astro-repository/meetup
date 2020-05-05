package members;

import administrator.Administrator;
import meetings.Meeting;
import user.User;

public class Members extends User {

	public Members(String nom, String prenoms) {
		super(nom, prenoms);
	}
	
	public void proposeMeetingAdmin(Administrator admin, Meeting meeting) {
		admin.setAllPropositions(meeting);
	}
	
	public void sendMessageInMeetingGroup(Administrator groupAdmin, int meetId, String msg) {
		
		if ( groupAdmin.getMeetingAccepted().containsKey(meetId) ) {
			
			Meeting meeting = groupAdmin.getMeetingAccepted().get(meetId);
			
			if ( groupAdmin.getMeetingAccepted()
					.get(meetId)
						.getMeetingAttendeeList()
						.get(meeting)
							.contains(this) ) {
				System.out.println(meeting);
				groupAdmin.meetingMessage
					.get(meetId)
					.add(this.getNom() +" " + this.getPrenoms() + " : " + msg);
				
			}
		
		} else {
			System.out.println("Group doesn't exist !");
		}
		
	}

	public void readAllMessageInMeetingGroup(Administrator groupAdmin, int meetId) {
		
		if ( groupAdmin.getMeetingAccepted().containsKey(meetId) ) {
			
			Meeting meeting = groupAdmin.getMeetingAccepted().get(meetId);
			if ( groupAdmin.getMeetingAccepted()
					.get(meetId)
						.getMeetingAttendeeList()
						.get(meeting)
							.contains(this) ) {
				
				for (String msg : groupAdmin.meetingMessage.get(meetId)) {
					System.out.println(msg);
				}
				
			}
		
		} else {
			System.out.println("Group doesn't exist !");
		}

	}
	
	public String readLastMessageInMeetingGroup(Administrator groupAdmin, int meetId) {
		
		if ( groupAdmin.getMeetingAccepted().containsKey(meetId) ) {
			
			Meeting meeting = groupAdmin.getMeetingAccepted().get(meetId);
			if ( groupAdmin.getMeetingAccepted()
					.get(meetId)
						.getMeetingAttendeeList()
						.get(meeting)
							.contains(this) ) {
				
				return groupAdmin.meetingMessage
						.get(meetId)
						.get(groupAdmin.meetingMessage.get(meetId).size() - 1);
				
			}
		
		}
		return "Group doesn't exist !";
	}
}
