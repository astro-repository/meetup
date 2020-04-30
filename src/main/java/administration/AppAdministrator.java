package administration;

import java.util.ArrayList;

import user.User;

public class AppAdministrator {
	
	public static void main(String[] args) {
		
		Administrator Amani 	= new Administrator("Amani", "Christian");
		Administrator Cédrick 	= new Administrator("Touré", "Cédrick");
		Administrator Clarisse 	= new Administrator("Aya", "Clarisse");
		
		ArrayList<User> participant 	= new ArrayList<User>();
		ArrayList<User> participant2 	= new ArrayList<User>();
		
		participant.add(Cédrick);
		participant2.add(Cédrick);
		participant2.add(Clarisse);
		
		Amani.createMeeting(participant);
		Amani.createMeeting(participant2);
		
		Cédrick.sendMessageInMeetingGroup(Amani, 1, "First message in group number 2");
		Cédrick.sendMessageInMeetingGroup(Amani, 0, "First message in group number 1");
		
		Clarisse.readLastMessageInMeetingGroup(Amani, 1);
		Clarisse.readLastMessageInMeetingGroup(Amani, 0);
		Clarisse.sendMessageInMeetingGroup(Amani, 1, "Clarisse send first message in group number 2");
//		Cédrick.readLastMessageInMeetingGroup(Amani, 1);
		Cédrick.readAllMessageInMeetingGroup(Amani, 1);
		
		Cédrick.proposeGroup(Amani, 1, participant2);
		Amani.showProposition();
	}
	
}
