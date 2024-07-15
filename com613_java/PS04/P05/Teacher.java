public class Teacher extends Person {
    private String dept;
    private int employeeId;

    public Teacher(String firstName, String lastName,
		   String dept, int employeeId) {
        super(firstName, lastName);
        this.dept = dept;
        this.employeeId = employeeId;
    }
    public String dept(){
	return dept;
    }
    
    public int employeeId(){
	return employeeId;
    }
    public Teacher employeeId(int id){
	this.employeeId = id;
        return this;
    }


    // Getters and setters for dept and employeeId
    // ...
}

// Teacher tt = new Teacher(...); //
// tt.employeeId(0001).dept("COMP");
