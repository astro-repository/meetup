package user;

import java.util.ArrayList;

public interface AdminInterface {
	
	void sendMessageInMeetingGroup(User groupAdmin, int meetId, String msg);
	void readLastMessageInMeetingGroup(User groupAdmin, int meetId);
	void readAllMessageInMeetingGroup(User groupAdmin, int meetId);
	void proposeGroup(User groupAdmin, int meetId, ArrayList<User> proposition);
	
}
