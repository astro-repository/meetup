package user;

public interface UserInterface {
	
	void sendMessage(User to, String msg);
	void readMessage(User to);
	void sendMessageToGroup(User idGroup);
	void readAllMessage();
	void readAllGroupMessage();
	void proposeGroup(User[] tab);
	void participateMeeting();
	void createMeeting(User[] tab);
	
}
