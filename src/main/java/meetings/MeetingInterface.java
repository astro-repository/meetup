package meetings;

import java.util.ArrayList;

import user.User;

public interface MeetingInterface {
	
	void proposeGroup(int meetId, 
			ArrayList<User> mAttendee, ArrayList<User> mNotAttendee, 
			ArrayList<User> mWaitlistMember);

}
