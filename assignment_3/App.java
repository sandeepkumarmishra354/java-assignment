public class App {
    public static void main(String args[]) {
        EngineeringDepartment engEmp = new EngineeringDepartment("John Wick", 36);
        ProductionDepartment prodEmp = new ProductionDepartment("Bruce Wayne", 42);

        engEmp.enroll();
        System.out.println("Engineering employee salery: " + engEmp.calculatePay() + "\n");
        prodEmp.enroll();
        System.out.println("Production employee salery: " + prodEmp.calculatePay() + "\n");

        engEmp.terminate();
        prodEmp.terminate();
    }
}