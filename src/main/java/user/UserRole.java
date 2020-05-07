package user;

import java.util.ArrayList;

public class UserRole {

	private User user;
	private ArrayList<Permission> userPermission;

	public UserRole(User user, Permission permission) {
		this.user = user;
		this.userPermission.add(permission);
	}

	public void addPermission(Permission permission) {
		this.userPermission.add(permission);
	}

	public void roleAdmin() {

	}

	public void roleMember() {
		
	}

	public void rolePayer() {

	}

}
