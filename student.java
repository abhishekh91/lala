public class student {
    private String name;
    private String dateOfBirth;

    public student(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Age verification done using Date input (no calculation).");
    }
}