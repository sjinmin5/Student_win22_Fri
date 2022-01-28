/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package student;

/**
 * This class +++Insert Description Here+++
 *
 * @author Suhjin Min
 */
public class PartTimeStudent extends Student1 {
    
    private int numCourses;

    public PartTimeStudent(String studentId, String studentName, int numCourses) {
        super(studentId, studentName);
        this.numCourses = numCourses;
    }
    
    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
    
    
}
