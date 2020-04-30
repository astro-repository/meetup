package administration;

import java.util.ArrayList;

import user.User;

public interface AdministratorInterface {
	
	void sendMessageInMeetingGroup(Administrator groupAdmin, int meetId, String msg);
	void readLastMessageInMeetingGroup(Administrator groupAdmin, int meetId);
	void readAllMessageInMeetingGroup(Administrator groupAdmin, int meetId);
	void proposeGroup(Administrator groupAdmin, int meetId, ArrayList<User> proposition);

}
