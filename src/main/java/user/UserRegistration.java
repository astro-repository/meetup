package user;

public class UserRegistration {

	private User user;
	private UserRegistrationStatus userStatus;

	public UserRegistration(User user) {
		this.user 		= user;
		this.userStatus = UserRegistrationStatus.WaitingForConfirmation;
	}

}
