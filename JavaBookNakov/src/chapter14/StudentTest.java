package chapter14;
public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Hristo", "Chavdarov", "Krachunov");
		Student student2 = new Student("Teodor", "Ivanov", "Ivanov");
		Student studen3 = new Student(3, "Financi", "Unss");

		student1.getStudentInfo();
		student2.getStudentInfo();
		studen3.getStudentInfo();
		
		createNewStudent("Ico", "gosho", "pesho");
		
		Student.getNumberOfStudents();

	}

	public static void createNewStudent(String... name) {
		for(String nStudent:name){
			Student newStudent1 = new Student(nStudent);
			newStudent1.setPhone(359);
			newStudent1.getStudentInfo();
		}
		
	}
}