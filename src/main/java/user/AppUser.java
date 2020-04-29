package user;

public class AppUser {
	
	public static void main(String[] args) {
		User Touré = new User("Touré", "Ahmed");
		User Cédrick = new User("Touré", "Cédrick");
		User Christian = new User("Amani", "Christian");
		Touré.sendMessage(Cédrick, "Hello Cédrick, my name is Touré");
		Touré.sendMessage(Cédrick, "2nd Hello Cédrick, my name is Touré");
		Christian.sendMessage(Cédrick, "Hello Cédrick, my name is Christian");
		
//		Cédrick.readLastUserMessage(Christian);
//		Cédrick.readLastUserMessage(Touré);
		Cédrick.readAllUserMessage(Touré);
//		Cédrick.readAllUserMessage(Christian);
//		Cédrick.readAllUsersMessage();
	}
	
}
