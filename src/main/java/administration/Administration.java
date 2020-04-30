package administration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import meetings.Meeting;
import user.User;

public class Administration extends User implements AdministrationInterface {
	
	private static int meetingCompt = 0;
	
	private ArrayList<Meeting> allPropositions 			= new ArrayList<Meeting>();
	private HashMap<Integer, Meeting> meetingAccepted 	= new HashMap<Integer, Meeting>();
	public HashMap<Integer, ArrayList<String>> meetingMessage 	= new HashMap<Integer, ArrayList<String>>();

	public Administration(String nom, String prenoms) {
		super(nom, prenoms);
	}
	
	public ArrayList<Meeting> getAllPropositions() {
		return allPropositions;
	}

	public void setAllPropositions(Meeting proposition) {
		this.allPropositions.add(proposition);
	}
	
	public String showProposition() {
		
		Scanner clavier = new Scanner(System.in);

		for (Meeting meeting : this.allPropositions) {
			
			System.out.println("Meeting Attendee List (proposition): ");
			for (Map.Entry<Meeting, ArrayList<User>> entry : meeting.getMeetingAttendeeList().entrySet()) {
				ArrayList<User> attendee = entry.getValue();
				for (User user : attendee) {
					System.out.println(user.getNom() + " " + user.getPrenoms());
				}
			}

			System.out.println("Meeting Waiting List (proposition): ");
			for (Map.Entry<Meeting, ArrayList<User>> entry : meeting.getMeetingWaitingList().entrySet()) {
				ArrayList<User> waiting = entry.getValue();
				for (User user : waiting) {
					System.out.println(user.getNom() + " " + user.getPrenoms());
				}
			}
			
			System.out.println("Meeting Not Attendee List (proposition): ");
			for (Map.Entry<Meeting, ArrayList<User>> entry : meeting.getMeetingNotAttendee().entrySet()) {
				ArrayList<User> notAttendee = entry.getValue();
				for (User user : notAttendee) {
					System.out.println(user.getNom() + " " + user.getPrenoms());
				}
			}
			
			System.out.println("Accepted (Y) / Rejected (N)");
			String response = clavier.nextLine();
			if ( response.equals("Y") ) {
				meetingCompt++;
				this.meetingAccepted.put(meetingCompt, meeting);
				ArrayList<String> msg = new ArrayList<String>();
				msg.add(
						"Group Create by "+ this.getNom() + " " + 
								this.getPrenoms() +", Propose by "+ meeting.getMember().getNom() + 
									" " + meeting.getMember().getPrenoms()
				);
				this.meetingMessage.put(meetingCompt, msg);
				clavier.close();
				return "Proposition accepted to create meeting !\n Meeting Id is : " +
						String.valueOf(meetingCompt);
			} else {
				this.allPropositions.remove(meeting);
				clavier.close();
				return "Proposition refused to create meeting !";
			}

		}
		clavier.close();
		return "Proposition not found !";
	}

	
	public HashMap<Integer, Meeting> getMeetingAccepted() {
		return meetingAccepted;
	}
	

	public void setMeetingAccepted(HashMap<Integer, Meeting> meetingAccepted) {
		this.meetingAccepted = meetingAccepted;
	}

}
