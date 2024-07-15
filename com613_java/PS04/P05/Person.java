public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String nameStr() {
	return String.format("%s, %s",lastName,firstName);
    }
    public String toString() {
	return String.format("Person(%s)",this.nameStr());
    }
    
    public static void main(String[] args) {
	Person p1 = new Person("Smith","John");

    System.out.println(p1.firstName);
	System.out.printf("person p1 = %s%n",p1);
	System.out.printf("new person = %s%n",
			  new Person("Jones","Paul"));
    }
    // More stuff
}
