package member;

public class Member {
	private String id;
	private String password;
	private String name;
	private int age;
	private String address;
	
	
public Member() {}

	public Member(String id, String password, String name, int age, String address) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}
	
}
