package fiveA;

import java.util.ArrayList;
import java.util.List;


	class Attendee implements AttendeeDetails {
	    private String attendeeName;
	    private String attendeeID;
	    private List<Module> joinedCourses;

	    public Attendee(String attendeeName, String attendeeID) {
	        this.attendeeName = attendeeName;
	        this.attendeeID = attendeeID;
	        this.joinedCourses = new ArrayList<>();
	    }

	    @Override
	    public String getAttendeeName() {
	        return attendeeName;
	    }

	    @Override
	    public String getAttendeeID() {
	        return attendeeID;
	    }

	    @Override
	    public void joinCourse(Module module) {
	        joinedCourses.add(module);
	        System.out.println(attendeeName + " joined " + module.getModuleName());
	    }

	    @Override
	    public void listJoinedCourses() {
	        System.out.println(attendeeName + " has joined:");
	        for (Module module : joinedCourses) {
	            System.out.println("- " + module.getModuleName());
	        }
	    }
	}

