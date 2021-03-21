public class EngineeringDepartment implements Employee {

    private boolean isEnrolled;
    private String empName;
    private int age;
    private final int payScale = 2100;// Here I'm considering this on daily basis

    public EngineeringDepartment(String empName, int age) {
        this.empName = empName;
        this.age = age;
    }

    public void enroll() {
        this.isEnrolled = true;
        System.out.println("Employee: " + this.empName + " : enrolled successfully in engineering department.");
    }

    public void terminate() {
        if (this.isEnrolled) {
            this.isEnrolled = false;
            System.out.println("Employee: " + this.empName + " : terminated successfully from engineering department.");
        } else {
            System.out.println("enroll an employee before terminating...");
        }
    }

    public double calculatePay() {
        if (this.isEnrolled) {
            // suppose employee worked for 30 days
            return this.payScale * 30;
        } else {
            System.out.println("enroll an employee before calculating pay...");
            return 0;
        }
    }
    
}