package administration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import meetings.Meeting;
import user.User;

public class Administrator extends User implements AdministratorInterface {

	private HashMap<Meeting, ArrayList<String>> meetingParticipate 	= new HashMap<User, ArrayList<String>>();
	private HashMap<Meeting, ArrayList<String>> meetingAttendeeList 	= new HashMap<User, ArrayList<String>>();
	private HashMap<Meeting, ArrayList<User>> meetingWaitingList 		= new HashMap<User, ArrayList<User>>();
	private HashMap<User, ArrayList<User>> allAdminMeetings 		= new HashMap<User, ArrayList<User>>();
	
	private ArrayList<Meeting> allPropositions 	= new ArrayList<Meeting>();
	
	private HashMap<Integer, ArrayList<User>> createMeeting = new HashMap<Integer, ArrayList<User>>();
	private HashMap<Integer, ArrayList<String>> myMeetingGroupCreate = new HashMap<Integer, ArrayList<String>>();
	
	public Administrator(String nom, String prenoms) {
		super(nom, prenoms);
	}
	
	private void createMeeting(ArrayList<User> usersList) {
		
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
	
	public void proposeGroup(Administrator groupAdmin, int meetId, ArrayList<User> proposition) {
		
		if ( groupAdmin
				.myMeetingGroupCreate
				.containsKey(meetId) && 
										groupAdmin.createMeeting
											.get(meetId)
											.contains(this) ) {

			groupAdmin.meetingWaitingList.put(this, proposition);
			
		} else {
			System.out.println("Admin doesn't exist !");
		}
		
	}
	
	public void showProposition() {
		
		Scanner clavier = new Scanner(System.in);

		for (Entry<User, ArrayList<User>> entry : this.meetingWaitingList.entrySet()) {
			User memberPropose = entry.getKey();
			ArrayList<User> propositions = entry.getValue();
			
			System.out.println(
				memberPropose.getNom() + " " 
					+ memberPropose.getPrenoms() 
					+ " propose list of :"
			);
			for (User user : propositions) {
				System.out.println(user.getNom() + " " + user.getPrenoms());
			}
			if ( propositions.size() > 0 ) {
				
				System.out.println("Accepted (Y) / Rejected (N)");
				String response = clavier.nextLine();
				if ( response.equals("Y") ) {
					this.allAdminMeetings.put(memberPropose, propositions);
					System.out.println("Proposition accepted to create meeting !");
				} else {
					this.meetingWaitingList.remove(memberPropose, propositions);
					System.out.println("Proposition refused to create meeting !");
				}
			}
			
		}
		
	}

	public HashMap<User, ArrayList<User>> getMeetingWaitingList() {
		return meetingWaitingList;
	}

	public void setMeetingWaitingList(Meeting memberCreateMeeting, ArrayList<User> proposition) {
		this.meetingWaitingList.put(memberCreateMeeting, proposition);
	}

	public HashMap<Meeting, ArrayList<String>> getMeetingParticipate() {
		return meetingParticipate;
	}

	public void setMeetingParticipate(Meeting memberCreateMeeting, ArrayList<User> proposition) {
		this.meetingParticipate.put(memberCreateMeeting, proposition);
	}

	public HashMap<Meeting, ArrayList<String>> getMeetingAttendeeList() {
		return meetingAttendeeList;
	}

	public void setMeetingAttendeeList(HashMap<Meeting, ArrayList<String>> meetingAttendeeList) {
		this.meetingAttendeeList = meetingAttendeeList;
	}

	public void setMeetingWaitingList(HashMap<Meeting, ArrayList<User>> meetingWaitingList) {
		this.meetingWaitingList = meetingWaitingList;
	}

	public HashMap<User, ArrayList<User>> getAllAdminMeetings() {
		return allAdminMeetings;
	}

	public void setAllAdminMeetings(HashMap<User, ArrayList<User>> allAdminMeetings) {
		this.allAdminMeetings = allAdminMeetings;
	}

	public HashMap<Integer, ArrayList<User>> getCreateMeeting() {
		return createMeeting;
	}

	public void setCreateMeeting(HashMap<Integer, ArrayList<User>> createMeeting) {
		this.createMeeting = createMeeting;
	}

	public HashMap<Integer, ArrayList<String>> getMyMeetingGroupCreate() {
		return myMeetingGroupCreate;
	}

	public void setMyMeetingGroupCreate(HashMap<Integer, ArrayList<String>> myMeetingGroupCreate) {
		this.myMeetingGroupCreate = myMeetingGroupCreate;
	}

	public ArrayList<Meeting> getAllPropositions() {
		return allPropositions;
	}

	public void setAllPropositions(Meeting proposition) {
		this.allPropositions.add(proposition);
	}
	
	
	
	

}
