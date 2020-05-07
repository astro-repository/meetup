package meetings;

import java.util.ArrayList;

import user.User;

public class MeetingAttendee {

	private ArrayList<User> user;

	public MeetingAttendee(ArrayList<User> user){
		this.user = user;
	}

	public ArrayList<User> getUser() {
		return user;
	}

	public void setUser(ArrayList<User> user) {
		this.user = user;
	}

}
