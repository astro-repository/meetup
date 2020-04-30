import java.util.ArrayList;

import administration.Administration;
import meetings.Meeting;
import members.Members;
import user.User;

public class App {

	public static void main(String[] args) {
		
		Administration Amani = new Administration("Amani", "Christian");
		Members Frederic = new Members("Boye", "Fréderic");
		Members Cédrick = new Members("Touré", "Cédrick");
		Members Moro = new Members("Moro", "Usernknown");
		
		ArrayList<User> mAttendee = new ArrayList<User>();
		ArrayList<User> mNotAttendee = new ArrayList<User>();
		ArrayList<User> mWaitlistMember = new ArrayList<User>();
		
		mAttendee.add(Frederic);
		mAttendee.add(Moro);
		
		Meeting ordreDuJour = new Meeting(Cédrick, "First meeting Cédrick", "Mise au point", 5, "Abidjan");
		ordreDuJour.proposeGroup(0, mAttendee, mNotAttendee, mWaitlistMember);
		Cédrick.proposeMeetingAdmin(Amani, ordreDuJour);
		System.out.println(Amani.getAllPropositions());
		System.out.println(Amani.showProposition());
		Moro.sendMessageInMeetingGroup(Amani, 1, "TEst");
		Moro.sendMessageInMeetingGroup(Amani, 1, "Message");
		Frederic.sendMessageInMeetingGroup(Amani, 1, "TEst");
		System.out.println("Message");
		Frederic.readAllMessageInMeetingGroup(Amani, 1);
		Frederic.readLastMessageInMeetingGroup(Amani, 1);
	}

}
