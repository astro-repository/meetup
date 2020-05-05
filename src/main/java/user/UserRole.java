package user;

public class UserRole extends Permission {
	private User userName;
	
	public UserRole(User user) {
		this.userName = user;
	}
	
	public void roleAdmin() {
		
		this.isAdministrator();
		System.out.println(
				this.userName.getNom() +
					" is permited ton administrated group."
		);
		
	}
	
	public void roleMember() {
		
		this.isMember();
		System.out.println(
				this.userName.getNom() +
					" is permited to create meeting."
		);
		
	}
	
	public void rolePayer() {
		
		this.isPayer();
		System.out.println(
				this.userName.getNom() +
					" is permited to pay to participate meeting."
		);
		
	}

}
