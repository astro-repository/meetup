package user;

public interface UserInterface {
	
	void sendMessage(User to, String msg);
	void readLastUserMessage(User friend);
	void readAllUserMessage(User author);
	void readAllUsersMessage();
	
}
