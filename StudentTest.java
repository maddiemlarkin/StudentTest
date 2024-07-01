class StudentTest {
   public static void main (String[] args) {
   
   // Below creates the first student.
   Student student1 = new Student("John", "Doe", 12345, "john.doe@example.com", "Computer Science");
   
   // Below creates the second student.
   Student student2 = new Student("Jane", "Smith", 67890, "jane.smith@example.com", "Biology");
   
   // Below creates the third student.
   Student student3 = new Student("Bob", "Johnson", 54321, "bob.johnson@example.com",  "History");


   // The following statements prints the information of each student using the toString() method internally.
   System.out.println(student1);
   System.out.println(student2); 
   System.out.println(student3);


   // Below changes the email adress of the third student using the mutator method.
   student3.changeEmail("bob.johnson@newemail.com");
   
   System.out.print("Updated ");
   System.out.println(student3);
   
   }
   
}

   
