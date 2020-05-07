package meetings;

import java.util.ArrayList;

import user.User;

public class MeetingNotAttendee {

	private ArrayList<User> user;

	public MeetingNotAttendee(ArrayList<User> user){
		this.user = user;
	}

	public ArrayList<User> getUser() {
		return user;
	}

	public void setUser(ArrayList<User> user) {
		this.user = user;
	}

}
