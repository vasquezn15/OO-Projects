// Class: 		CS 1302/01
// Term: 		Fall 2017
// Name: 		Nicolas Vasquez
// Instructor: 	Dr. Haddad
// Assignment 4
public class Course
{
	// Instance members
   private String courseName;
   private int creditHours;
   private char letterGrade;  
	
	//Constructors
   public Course()
   {}
	 
   public Course(String cName, int cHours, char lGrade)
   {
      courseName  = cName;
      creditHours = cHours;
      letterGrade = lGrade;
   }
	  
	// Setter for courseName
   public void setCourseName(String courseName)
   {
      this.courseName = courseName;
   }
	
	// Setter for letterGrade 
   public void setLetterGrade(char letterGrade)
   {
      this.letterGrade = letterGrade;
   }

	// Setter for creditHours
   public void setCreditHours(int creditHours)
   {
      this.creditHours = creditHours;
   }
	
	// Getter for courseName
   public String getCourseName()
   {
      return courseName;
   }

	// Getter for letterGrade 
   public char getLetterGrade()
   {
      return letterGrade;
   }

	// Getter for creditHours
   public int getCreditHours()
   {
      return creditHours;
   }

	// Method to compute GPA for courses
   public static double computeGPA(Course[] clist)
   {
      double gpa = 0.0;
      int gradePoints = 0;
      int totalCredits = 0;
   	
      for(Course c: clist)
      {
         int numCredits = 4;
         gradePoints += c.getGradePoint() * numCredits;
         totalCredits += numCredits;
      }
   	
      gpa = ((double) gradePoints)/totalCredits;
      return gpa;
   }
	
	// Method to convert letterGrade to a grade point numerical value
   private int getGradePoint()
   {
      int gp = 0;
      switch(getLetterGrade())
      {
         case 'A':
            gp = 4;
            break;
         case 'B':
            gp = 3;
            break;
         case 'C':
            gp = 2;
            break;
         case 'D':
            gp = 1;
            break;
         default:
            gp = 0;
      }
   	
      return gp;
   }

	// A way to test the class
   public static void main(String[] args)
   {
      Course c1 = new Course();
      c1.setCreditHours(3);
      c1.setLetterGrade('A');
   
      Course c2 = new Course();
      c2.setCreditHours(3);
      c2.setLetterGrade('C');
   	
      Course[] clist = new Course[2];
      clist[0] = c1;
      clist[1] = c2;
   	
      System.out.println("GPA=" + Course.computeGPA(clist));
   }
}