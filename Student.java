
public class Student {

// The following sets the attributes for the information needed about Students.
   private String firstName;
   private String lastName;
   private int studentId;
   private String email;
   private String major;
   
// This is a parameterized constructor that allows you to set the values of the above attributes when a new Student object is made.
   public Student(String inputFirst, String inputLast, int inputId, String inputEmail, String inputMajor) {
      firstName = inputFirst;
      lastName = inputLast;
      studentId = inputId;
      email = inputEmail;
      major = inputMajor;
   }
   
   
// Below are the get methods (accessors) for each of the attributes in the Student class. They allow you to retrieve the values of the attributes.
   public String getFirstName() {
   return firstName;
   }
   
   public String getLastName() {
   return lastName;
   }
   
   public int getStudentId() {
   return studentId;
   }
   
   public String getEmail() {
   return email;
   }
   
   public String getMajor() {
   return major;
   }
   
// Below is the set method (mutator) that allows you to change the email address of a student.
   public void changeEmail(String newEmail) {
   email = newEmail;
   }
   
   
// Below is a toString() method that allows the user to print a String representation of the Student object in a certain format.
   public String toString() {
   
   
   
   return "Student Information:\n" + "Full Name: " + firstName + " " + lastName + "\n" + "Student ID: " + studentId + "\n" + "Email: " + email + "\n" +  "Major: " + major + "\n";
    }
}