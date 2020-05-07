package members;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import administrator.Administrator;
import meetings.Meeting;
import user.User;

public class MembersTest {
	
	Administrator Amani = new Administrator("Amani", "Christian");
	Members Frederic = new Members("Boye", "Fréderic");
	Members Cédrick = new Members("Touré", "Cédrick");
	Members Moro = new Members("Moro", "Usernknown");
	
	ArrayList<User> mAttendee = new ArrayList<User>();
	ArrayList<User> mNotAttendee = new ArrayList<User>();
	ArrayList<User> mWaitlistMember = new ArrayList<User>();
	

	@Test
	public void test() {

	}

}
