// Class: 		CS 1302/01
// Term: 		Fall 2017
// Name: 		Nicolas Vasquez
// Instructor: 	Dr. Haddad
// Assignment 4
import java.text.CharacterIterator;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ComputeStudentGPAProgram {
    public static void main(String[] args) throws FileNotFoundException {

        //Creates file Irving-Whitewood
        File file = new File("src/Irving-Whitewood.txt");

        //Gets name of file and splits it when there is a dash
        String fileName = file.getName();
        String[] name = fileName.split("-");
        Scanner input = new Scanner(file);
        MyStudent student = new MyStudent(name[0], name[1].substring(0, name[1].length()-4));

        //While loop that reads the lines in the file
        while (input.hasNext()){
            String text = input.nextLine();
            String[] s = text.split(",");
            String cName = s[0];
            String cHours = s[1];
            String cGrade = s[2];
            student.addCourse(cName, Integer.parseInt(cHours), cGrade.charAt(0));
        }
        input.close();

        //Prints the output of the toString from the student class
        System.out.println(student.toString());
    }
}
