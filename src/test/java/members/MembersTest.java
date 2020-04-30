package members;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import administration.Administration;
import meetings.Meeting;
import user.User;

public class MembersTest {
	
	Administration Amani = new Administration("Amani", "Christian");
	Members Frederic = new Members("Boye", "Fréderic");
	Members Cédrick = new Members("Touré", "Cédrick");
	Members Moro = new Members("Moro", "Usernknown");
	
	ArrayList<User> mAttendee = new ArrayList<User>();
	ArrayList<User> mNotAttendee = new ArrayList<User>();
	ArrayList<User> mWaitlistMember = new ArrayList<User>();
	

	@Test
	public void test() {
		
		mAttendee.add(Frederic);
		mAttendee.add(Moro);
		
		Meeting ordreDuJour = new Meeting(Cédrick, "First meeting Cédrick", "Mise au point", 5, "Abidjan");
		ordreDuJour.proposeGroup(0, mAttendee, mNotAttendee, mWaitlistMember);
		Cédrick.proposeMeetingAdmin(Amani, ordreDuJour);
		
		assertEquals("Proposition accepted to create meeting !\n Meeting Id is : 1", Amani.showProposition());
		
		Moro.sendMessageInMeetingGroup(Amani, 1, "TEst tgh");
		Moro.sendMessageInMeetingGroup(Amani, 1, "Message");
		Frederic.sendMessageInMeetingGroup(Amani, 1, "TEst");

		assertEquals("Boye Fréderic : TEst", Frederic.readLastMessageInMeetingGroup(Amani, 1));
		
	}

}