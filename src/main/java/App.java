import administration.Administration;
import meetings.Meeting;
import members.Members;

public class App {

	public static void main(String[] args) {
		
		Administration Amani = new Administration("Amani", "Christian");
		Members Frederic = new Members("Boye", "Fréderic");
		Members Cédrick = new Members("Touré", "Cédrick");
		Members Moro = new Members("Moro", "Unknown");
		
		Meeting ordreDuJour = new Meeting(Cédrick, "First meeting Cédrick", "Mise au point", 5, "Abidjan");
		ordreDuJour.
		Cédrick.proposeMeetingAdmin(Amani, ordreDuJour);
	}

}
