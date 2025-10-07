package lab;

public class Student {

    // Attributes
    private int studentId;
    private String studentName;
    private String city;
    private int marks1;
    private int marks2;
    private int marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public boolean isEligibleForScholarship() {
        return isEligibleForScholarship;
    }

    public void setEligibleForScholarship(boolean isEligibleForScholarship) {
        this.isEligibleForScholarship = isEligibleForScholarship;
    }

    // Method to calculate annual fee
    public float getAnnualFee() {
        return feePerMonth * 12;
    }

    // Method to calculate total marks
    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate average
    public float getAverage() {
        return getTotalMarks() / 3.0f;
    }

    // Method to get result
    public String getResult() {
        if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
            return "pass";
        } else {
            return "fail";
        }
    }
}
