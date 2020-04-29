package administration;

import java.util.ArrayList;
import java.util.HashMap;

import user.User;

public class Administrator extends User {

	private HashMap<User, ArrayList<String>> mettingParticipate 	= new HashMap<User, ArrayList<String>>();
	private HashMap<User, ArrayList<String>> mettingAttendeeList 	= new HashMap<User, ArrayList<String>>();
	private HashMap<User, ArrayList<String>> mettingWaitingList 	= new HashMap<User, ArrayList<String>>();
	
	private HashMap<Integer, ArrayList<User>> createMeeting = new HashMap<Integer, ArrayList<User>>();
	private HashMap<Integer, ArrayList<String>> myMeetingGroupCreate = new HashMap<Integer, ArrayList<String>>();
	
	public Administrator(String nom, String prenoms) {
		super(nom, prenoms);
	}
	
	public void createMeeting(ArrayList<User> usersList) {
		
		this.createMeeting.put(meetingId, usersList);
		System.out.println("Your meeting id is : " + meetingId);
		
		ArrayList<String> tab = new ArrayList<String>();
		tab.add(
			"Group create by : "+ this.getNom() +" "+ this.getPrenoms()
		);
		this.myMeetingGroupCreate.put(meetingId, tab);
		
		meetingId++;
		
	}
	
	public void sendMessageInMeetingGroup(Administrator groupAdmin, int meetId, String msg) {
		
		if ( groupAdmin.myMeetingGroupCreate.containsKey(meetId) ) {
			
			groupAdmin.myMeetingGroupCreate
				.get(meetId)
				.add(this.getNom() +" " + this.getPrenoms() + " : " + msg);
			
		} else {
			System.out.println("Group doesn't exist !");
		}
		
	}
	
	public void readLastMessageInMeetingGroup(Administrator groupAdmin, int meetId) {
		
		if ( groupAdmin
				.myMeetingGroupCreate
				.containsKey(meetId) && 
										groupAdmin.createMeeting
											.get(meetId)
											.contains(this) ) {
			
			int msgLength = groupAdmin.myMeetingGroupCreate
							.get(meetId)
							.size() - 1;
			
			System.out.println(
				groupAdmin.myMeetingGroupCreate
					.get(meetId)
					.get( msgLength )
			);
			
		} else {
			System.out.println("Group doesn't exist !");
		}
		
	}
	
	public void readAllMessageInMeetingGroup(Administrator groupAdmin, int meetId) {
		
		if ( groupAdmin
				.myMeetingGroupCreate
				.containsKey(meetId) && 
										groupAdmin.createMeeting
											.get(meetId)
											.contains(this) ) {

			for (String elmt : groupAdmin.myMeetingGroupCreate.get(meetId)) {
				System.out.println(elmt);
			}
			
		} else {
			System.out.println("Group doesn't exist !");
		}
		
	}

}
