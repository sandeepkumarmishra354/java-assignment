public class App {

    public static void main(String args[]) {
        MCAAdmission admission1 = new MCAAdmission("student 1");
        MCAAdmission admission2 = new MCAAdmission("student 2");
        MCAAdmission admission3 = new MCAAdmission("student 3");
        MCAAdmission admission4 = new MCAAdmission("student 4");
        MCAAdmission admission5 = new MCAAdmission("student 5");
        //check admission count before admitting any student.
        System.out.println("---------------------");
        System.out.println("Total admission: " + MCAAdmission.totalAdmissions());
        System.out.println("---------------------");
        //admit all the students.
        admission1.getAdmission();
        admission2.getAdmission();
        admission3.getAdmission();
        admission4.getAdmission();
        admission5.getAdmission();
        //check admission count after admitting all the students.
        System.out.println("---------------------");
        System.out.println("Total admission: " + MCAAdmission.totalAdmissions());
        System.out.println("---------------------");
    }

}
