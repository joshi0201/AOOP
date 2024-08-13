package srp;

public class EmployeeDetails {
	private String fullName;
    private String position;

    public EmployeeDetails(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
        System.out.println("Employee details: " + fullName + ", Position: " + position);
    }

    public String getPosition() {
        System.out.println("Fetching position for employee: " + fullName);
        return position;
    }


}
