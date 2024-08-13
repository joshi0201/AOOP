package fiveA;

import java.util.ArrayList;
import java.util.List;



	class Module implements ModuleDetails {
	    private String moduleID;
	    private String moduleName;
	    private List<Attendee> joinedAttendees;

	    public Module(String moduleID, String moduleName) {
	        this.moduleID = moduleID;
	        this.moduleName = moduleName;
	        this.joinedAttendees = new ArrayList<>();
	    }

	    @Override
	    public String getModuleID() {
	        return moduleID;
	    }

	    @Override
	    public String getModuleName() {
	        return moduleName;
	    }

	    @Override
	    public void addAttendee(Attendee attendee) {
	        joinedAttendees.add(attendee);
	        System.out.println(attendee.getAttendeeName() + " joined " + moduleName);
	    }

	    @Override
	    public void listJoinedAttendees() {
	        System.out.println("Attendees in " + moduleName + ":");
	        for (Attendee attendee : joinedAttendees) {
	            System.out.println("- " + attendee.getAttendeeName());
	        }
	    }
	}

	// EnrollmentHandler class adhering to the Open/Closed Principle
	class EnrollmentHandler {
	    public void handleEnrollment(AttendeeDetails attendee, ModuleDetails module) {
	        attendee.joinCourse((Module) module);
	        module.addAttendee((Attendee) attendee);
	    }
	}

	// Example class adhering to the Dependency Inversion Principle
	class LearningSystem {
	    private EnrollmentHandler enrollmentHandler;

	    public LearningSystem(EnrollmentHandler enrollmentHandler) {
	        this.enrollmentHandler = enrollmentHandler;
	    }

	    public void enrollAttendeeInModule(AttendeeDetails attendee, ModuleDetails module) {
	        enrollmentHandler.handleEnrollment(attendee, module);
	    }
	}

