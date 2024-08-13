package fiveC;

public class Member {
	private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        System.out.println("Member created: " + name + ", ID: " + memberId);
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }


}
