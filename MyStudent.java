// Class: 		CS 1302/01
// Term: 		Fall 2017
// Name: 		Nicolas Vasquez
// Instructor: 	Dr. Haddad
// Assignment 4
import java.util.ArrayList;
public class MyStudent extends Student {

    //Creates array list of courses
    private static ArrayList<Course> courseList = new ArrayList<>();

    //Method that adds course to the array list
    public static void addCourse(String courseName, int creditHours, char letterGrade){
        Course course = new Course(courseName, creditHours, letterGrade);
        courseList.add(course);
    }

    //Constructor for MyStudent class
    public MyStudent(String fname, String lname){
        super(fname, lname, courseList.size()+5);
    }

    @Override
    public String toString(){
        double avg = 0;
        for (int i = 0;i < courseList.size();i++){
            super.createCourse(courseList.get(i).getCourseName(), courseList.get(i).getCreditHours(),
                    courseList.get(i).getLetterGrade());
        }

        return super.toString();

    }
}
