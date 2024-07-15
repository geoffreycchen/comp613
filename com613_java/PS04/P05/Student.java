// import Person

public class Student extends Person {
    private String major;
    private int studentId;

    public Student(String firstName, String lastName, String major,
		   int studentId) {
        super(firstName, lastName);
        this.major = major;
        this.studentId = studentId;
    }
    public Student(String firstName, String lastName,
		   int studentId) {
        super(firstName, lastName);
        this.major = "Unknown";
        this.studentId = studentId;
    }
    
    public String hasMajor() {
	return major;
    }
    public String hasMajor(String s) {
	String rv = major;
	major = s;
	return rv;
    }
    public int studentId(){
	return studentId;
    }
    public String toString() {
	return String.format("Student(Nm:%s  Maj:%s Id:%d)",
			     this.nameStr(), major, studentId);
    }
    public static void main(String[] args) {
	Student s1 = new Student("Em","Emin",100);
	System.out.printf("s1 = %s%n", s1);
	System.out.printf("s1 major = %s%n", s1.hasMajor());
	String om = s1.hasMajor("COMP");
	System.out.printf("s1 old major = %s, new major = %s%n", om, s1.hasMajor());
    }
}
