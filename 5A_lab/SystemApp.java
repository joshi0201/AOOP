package fiveA;

	public class SystemApp {
	    public static void main(String[] args) {
	        // Create attendees
	        Attendee attendee1 = new Attendee("John", "A001");
	        Attendee attendee2 = new Attendee("Jane", "A002");

	        // Create modules
	        Module module1 = new Module("M101", "Computer Science");
	        Module module2 = new Module("M102", "Biology");

	        // Create EnrollmentHandler
	        EnrollmentHandler enrollmentHandler = new EnrollmentHandler();

	        // Create LearningSystem with dependency injection
	        LearningSystem learningSystem = new LearningSystem(enrollmentHandler);

	        // Enroll attendees in modules
	        learningSystem.enrollAttendeeInModule(attendee1, module1);
	        learningSystem.enrollAttendeeInModule(attendee2, module2);

	        // Display joined courses and attendees
	        attendee1.listJoinedCourses();
	        attendee2.listJoinedCourses();
	        module1.listJoinedAttendees();
	        module2.listJoinedAttendees();
	    }
	}

