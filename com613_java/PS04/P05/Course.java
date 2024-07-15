
public class Course {
    private static final int MAX_STUDENTS = 3;
    private Teacher teacher;
    private Student[] students = new Student[MAX_STUDENTS];
    private String courseTitle;
    private int currentStudentCount = 0;

    public Course(Teacher teacher, String courseTitle) {
	    this.teacher = teacher;
	    this.courseTitle = courseTitle;
    }


    public void addStudent(Student student) {
	if (currentStudentCount < MAX_STUDENTS) {
            students[currentStudentCount++] = student;
	}
	else {
            System.out.println("Course is full!");
	}
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void delStudent(String firstname, String lastname) {

		/*
		The delStudent method signature takes 2 Strings, a firstname and a lastname, 
		and deletes the Student with that name from the Course. If no student by that name exists,
 		then print the message "Student not enrolled in this course".
		 */


		for (int i = 0; i < currentStudentCount; i++) {
			Student student = students[i];

			if (student.firstName.equals(firstname) && student.lastName.equals(lastname)) {
		
				students[i] = students[currentStudentCount - 1];
				students[currentStudentCount - 1] = null; 
				currentStudentCount--; 	
				return; 
			}
		}
		System.out.println("Student not enrolled in this course");
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////

    public String toString() {
	String cc = String.format("Course:  %s\nTeacher: %s\n",
				  this.courseTitle,this.teacher);
	String sts = "";
	for (int i=0; i < currentStudentCount; i++){
	    sts += students[i].toString() + " ";
	}
	return cc + sts + "\n";
    }
    
	
	
	public static void main(String args[]){
	Teacher tt = new Teacher("Steven",  "Hawking",  "Physics",  1001);

	Course c1 = new Course(tt,"Intro to Everything");

	System.out.printf("Course c1 = %s\n",c1); // Course c1 = Course:  Intro to Everything

	Student s1 = new Student("Jon","Doe",20201);
	Student s2 = new Student("Huan","Jin",01);

	c1.addStudent(s1);
	c1.addStudent(s2);
	c1.delStudent("Huan","Jin");
	c1.delStudent("Jon","Doe");

	System.out.printf("Course c1 = %s\n",c1);
    }
}


