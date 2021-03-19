package interfaceAbstractPkg;

public class Rectangle implements Area {

    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double compute() {
        return this.width * this.height;
    }

    public void display() {
        System.out.println("Reactangle's area is: "+this.compute() + " square unit.");
    }

}
