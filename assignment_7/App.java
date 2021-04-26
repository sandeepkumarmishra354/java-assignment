import java.awt.Label;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App implements MouseListener {

    private Frame frame;
    private Label label;
    private Panel panel;

    public static void main(String args[]) {
        App app = new App();
        app.run();
    }

    private void run() {
        this.frame = new Frame("Mouse pointer example");
        this.frame.setSize(500, 250);
        this.panel = new Panel();
        //this.panel.setSize(this.frame.getWidth(), this.frame.getHeight());
        this.label = new Label("Hello World !!", Label.CENTER);
        this.panel.addMouseListener(this);
        this.panel.add(this.label);
        this.frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
        this.frame.add(this.panel);
        this.frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String message = String.format("x: %d, y: %d", e.getX(), e.getY());
        this.label.setText(message);
        System.out.println(message);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // reset
        this.label.setText("Hello World !!");
    }
}