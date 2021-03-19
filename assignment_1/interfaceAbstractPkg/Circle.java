package interfaceAbstractPkg;

public class Circle implements Area {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double compute() {
        return (Area.PI * (this.radius * this.radius));
    }

    public void display() {
        System.out.println("Circle's area is: " + this.compute() + " square unit.");
    }

    public void display(String name) {
        System.out.println(name);
    }

}
