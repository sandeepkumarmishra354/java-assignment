import interfaceAbstractPkg.Circle;
import interfaceAbstractPkg.Rectangle;

public class App {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle(5, 10);
        Circle cir = new Circle(6);
        rect.display();
        cir.display();
    }
}