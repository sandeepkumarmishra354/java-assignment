public class MCAAdmission {
    //static variable
    private static int totalAdmission;
    //instance variable
    private String studentName = "";

    public MCAAdmission(String studentName) {
        this.studentName = studentName;
    }

    public void getAdmission() {
        System.out.println("New student admitted: " + this.studentName);
        MCAAdmission.totalAdmission += 1;
    }

    //static method
    public static int totalAdmissions() {
        return totalAdmission;
    }
}