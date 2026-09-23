/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinal_Exercises;

/**
 *
 * @author User
 */
public class SGMS {
    private int studentID;
    private String name;
    private String course;
    private double prelimGrade;
    private double midtermGrade;
    private double finalGrade;
    
    public SGMS(){
        
    }

        public SGMS(int studentID, String name, String course, double prelimGrade, double midtermGrade, double fanalGrade) {
            this.studentID = studentID;
            this.name = name;
            this.course = course;
            this.prelimGrade = prelimGrade;
            this.midtermGrade = midtermGrade;
            this.finalGrade = finalGrade;
        }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPrelimGrade() {
        return prelimGrade;
    }

    public void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public double getFanalGrade() {
        return finalGrade;
    }

    public void setFanalGrade(double fanalGrade) {
        this.finalGrade = fanalGrade;
    }

  public double calculateAverage(){
      return (prelimGrade + midtermGrade + finalGrade) / 3;
  }
 
 public String getClassification(){
     double average = calculateAverage();
     
     if (average >= 90){
         return "Excellent";
     }else if (average >= 85){
         return "Very Good";
     }else if (average >= 80){
         return "Good";
     }else if (average >= 75){
         return "Passing";
     }else{
         return "Failed";
     }
 }  
 
 public void displaystudentInfo(){
     double average = calculateAverage();
     
     System.out.println("===== STUDENT INFORMATION =====");
     System.out.println();
     System.out.println("Student ID: " + studentID);
     System.out.println("Name: " + name);
     System.out.println("Course: " + course);
     System.out.println("Prelim Grade: " + prelimGrade);
     System.out.println("Midterm Grade: " + midtermGrade);
     System.out.println("Final Grade: " + finalGrade);
     System.out.printf("Average: %.2f%n", average);
     System.out.println("Classification: " + getClassification());
     
     if (average >= 75){
         System.out.println("Status: PASSED");
     }else{
         System.out.println("Status: FAILED");
     }
 }

    void studentInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
     
}
