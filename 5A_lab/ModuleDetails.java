package fiveA;

public interface ModuleDetails {
	String getModuleID();
    String getModuleName();
    void addAttendee(Attendee attendee);
    void listJoinedAttendees();

}
