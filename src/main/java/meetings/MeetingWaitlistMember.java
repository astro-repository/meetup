package meetings;

import java.util.ArrayList;

import user.User;

public class MeetingWaitlistMember {

	private ArrayList<User> user;

	public MeetingWaitlistMember(ArrayList<User> user){
		this.user = user;
	}

	public ArrayList<User> getUser() {
		return user;
	}

	public void setUser(ArrayList<User> user) {
		this.user = user;
	}

}
