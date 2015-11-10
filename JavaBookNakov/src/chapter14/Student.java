package chapter14;
public class Student {

	private  String firstName;
	private  String middleName;
	private  String lastName;
	private int course;
	private String specialty;
	private String university;
	private String mail = null;
	private int phone = 0;
	public static int countStudent;

	
	public Student() {
		this.firstName = "Razvigor";
		countStudent++;
	}
	public Student(String name) {
		this.firstName = name;
		countStudent++;
	}

	public Student(String name, String middle, String last) {

		this.firstName = name;
		this.middleName = middle;
		this.lastName = last;
		countStudent++;
	}

	public Student(int courss, String spec, String uni) {
		this();
		this.course = courss;
		this.specialty = spec;
		this.university = uni;
	}

	public void getStudentInfo() {
		System.out.println();
		System.out.printf("The full name on student is: " + this.firstName + " " + this.middleName + " " + this.lastName);
		System.out.printf("\n He is the " + this.course + "  course in a "
				+ this.specialty + "\n in a " + this.university);
		System.out.println("\n Their phone number is: " + this.phone
				+ "\n and e-mail: " + this.mail);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public static void getNumberOfStudents() {
		System.out.println();
		System.out.println("Number of student is: " + countStudent);
	}

}
