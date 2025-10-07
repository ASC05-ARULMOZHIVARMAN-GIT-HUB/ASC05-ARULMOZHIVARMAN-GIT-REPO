package lab;

public class TestMain {
    public static void main(String[] args) {

        // Create 3 student objects
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        // Set values using setters
        s1.setStudentId(101);
        s1.setStudentName("Alice");
        s1.setCity("New York");
        s1.setMarks1(85);
        s1.setMarks2(78);
        s1.setMarks3(90);
        s1.setFeePerMonth(1200.0f);
        s1.setEligibleForScholarship(true);

        s2.setStudentId(102);
        s2.setStudentName("Bob");
        s2.setCity("Chicago");
        s2.setMarks1(65);
        s2.setMarks2(70);
        s2.setMarks3(68);
        s2.setFeePerMonth(950.0f);
        s2.setEligibleForScholarship(false);

        s3.setStudentId(103);
        s3.setStudentName("Charlie");
        s3.setCity("Los Angeles");
        s3.setMarks1(55);
        s3.setMarks2(60);
        s3.setMarks3(58);
        s3.setFeePerMonth(800.0f);
        s3.setEligibleForScholarship(true);

        // Store in array for easy processing
        Student[] students = {s1, s2, s3};

        // 1. Find student with highest total marks
        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = s;
            }
        }
        System.out.println("Student with highest total marks: " + topStudent.getStudentName());

        // 2. Student who pays the least monthly fee
        Student leastFeeStudent = students[0];
        for (Student s : students) {
            if (s.getFeePerMonth() < leastFeeStudent.getFeePerMonth()) {
                leastFeeStudent = s;
            }
        }
        System.out.println("Student with lowest monthly fee: " + leastFeeStudent.getStudentName() +
                           " - Fee: $" + leastFeeStudent.getFeePerMonth());

        // 3. Print details for all students
        System.out.println("\n--- Student Details ---");
        for (Student s : students) {
            System.out.println("Name: " + s.getStudentName());
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.println("Average Marks: " + s.getAverage());
            System.out.println("Result: " + s.getResult());
            System.out.println("Eligible for Scholarship: " + (s.isEligibleForScholarship() ? "Yes" : "No"));
            System.out.println();
        }
    }
}
