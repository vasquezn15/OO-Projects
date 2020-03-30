// Class: 		CS 1302/01
// Term: 		Fall 2017
// Name: 		Nicolas Vasquez
// Instructor: 	Dr. Haddad
// Assignment 4
public class Student
{

   //Declare variables
   private String fname;
   private String lname;
   private Course[] cArry;
   private int numCourses;
   private double avg;

   //Default Constructor
   public Student(){

   }
   //Constructor for the variables
   public Student(String firstname, String lastname, int numCourses){
      this.fname = firstname;
      this.lname = lastname;
      cArry = new Course[numCourses];
   }
   
   public void createCourse(String courseName, int creditHours, char letterGrade) {
      Course b = new Course(courseName, creditHours, letterGrade);
      for (int j = 0; j < cArry.length; j++) {
         if (cArry[j] == null) {
            cArry[j] = b;
         }
      }
   }

    //toString that returns the output
   public String toString(){
      avg = Course.computeGPA(cArry);
      return "Student " + fname + " " + lname + " has a " + avg + " GPA";
   }
}