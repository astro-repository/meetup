package members;

import administration.Administrator;
import meetings.Meeting;
import user.User;

public class Members extends User {

	public Members(String nom, String prenoms) {
		super(nom, prenoms);
	}
	
	public void proposeMeetingAdmin(Administrator admin, Meeting meeting) {
		admin.setAllPropositions(meeting);
	}

}
