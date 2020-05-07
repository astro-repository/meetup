package user;

public class Permission {

	private TypeOfPermission userPermission;

	public Permission() {
		this.userPermission = TypeOfPermission.Member;
	}

	public Permission(TypeOfPermission permission) {
		this.userPermission = permission;
	}

}
