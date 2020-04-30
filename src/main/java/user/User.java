package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class User implements UserInterface {
	
//	public static int meetingId = 0;
	
	private String nom;
	private String prenoms;
	private HashMap<User, ArrayList<String>> myMessage = new HashMap<User, ArrayList<String>>();

	public User(String nom, String prenoms) {

		this.nom 		= nom;
		this.prenoms 	= prenoms;
		
	}

	public void sendMessage(User to, String msg) {
		
		if ( to.myMessage.containsKey(this) ) {
			to.myMessage.get(this).add(msg);
		}else {
			ArrayList<String> tableau = new ArrayList<String>();
			tableau.add(msg);
			to.myMessage.put(this, tableau);
		}
		
	}

	public void readLastUserMessage(User friend) {
		
		if ( this.myMessage.containsKey(friend) ) {
			int msgSize = this.myMessage.get(friend).size()-1;
			System.out.println( friend.getNom() + " " + friend.getPrenoms() +" : " + this.myMessage.get(friend).get( msgSize ) );
		}
		else
			System.out.println("Message not found !");
		
	}
	
	public void readAllUserMessage(User author) {
		if ( this.myMessage.containsKey(author) ) {
			for (String msg : this.myMessage.get(author)) {
				System.out.println(author.getNom() + " " + author.getPrenoms() + " : " + msg);
			}
		} else {
			System.out.println("Messages not found !");
		}
		
	}
	
	public void readAllUsersMessage() {

		for(Map.Entry<User, ArrayList<String>> entry : this.myMessage.entrySet()) {
			
		    User userId = entry.getKey();
		    ArrayList<String> tabMsg = entry.getValue();
		    for (String msg : tabMsg) {
				System.out.println(userId.getNom() + " " + userId.getPrenoms() + " : " + msg);
			}

		}
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenoms() {
		return prenoms;
	}

	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

}
