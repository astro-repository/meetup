package members;

import administration.Administration;
import meetings.Meeting;
import user.User;

public class Members extends User {

	public Members(String nom, String prenoms) {
		super(nom, prenoms);
	}
	
	public void proposeMeetingAdmin(Administration admin, Meeting meeting) {
		admin.setAllPropositions(meeting);
	}
	
	public void sendMessageInMeetingGroup(Administration groupAdmin, int meetId, String msg) {
		
		if ( groupAdmin.getMeetingAccepted().containsKey(meetId) ) {
			
			Meeting meeting = groupAdmin.getMeetingAccepted().get(meetId);
			if ( groupAdmin.getMeetingAccepted()
					.get(meetId)
						.getMeetingAttendeeList()
						.get(meeting)
							.contains(this) ) {
				
				groupAdmin.meetingMessage
					.get(meetId)
					.add(this.getNom() +" " + this.getPrenoms() + " : " + msg);
				
			}
		
		} else {
			System.out.println("Group doesn't exist !");
		}
		
	}

	public void readAllMessageInMeetingGroup(Administration groupAdmin, int meetId) {
		
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
	
	public void readLastMessageInMeetingGroup(Administration groupAdmin, int meetId) {
		
		if ( groupAdmin.getMeetingAccepted().containsKey(meetId) ) {
			
			Meeting meeting = groupAdmin.getMeetingAccepted().get(meetId);
			if ( groupAdmin.getMeetingAccepted()
					.get(meetId)
						.getMeetingAttendeeList()
						.get(meeting)
							.contains(this) ) {
				
				System.out.println(
						groupAdmin.meetingMessage
						.get(meetId)
						.get(groupAdmin.meetingMessage.size() - 1)
				);
				
			}
		
		} else {
			System.out.println("Group doesn't exist !");
		}

	}
}
