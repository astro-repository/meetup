package user;

public interface MessageAction {
	
	void sendMessage(User to, String msg);
	void readLastUserMessage(User friend);
	void readAllUserMessage(User author);
	void readAllUsersMessage();
	
}
