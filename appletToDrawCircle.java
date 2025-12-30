import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCircle extends Applet implements ActionListener {
    
    TextField tRadius, tColor;

    public void init() {
        // Create components with DEFAULT values to prevent errors
        tRadius = new TextField("50", 5); 
        tColor = new TextField("red", 5);
        Button b = new Button("Draw");
        
        add(new Label("Radius:")); add(tRadius);
        add(new Label("Color:"));  add(tColor);
        add(b);

        b.addActionListener(this);
    }

    // The listener just triggers the paint method
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        try {
            // 1. Read inputs directly inside paint
            int r = Integer.parseInt(tRadius.getText());
            String c = tColor.getText();

            // 2. Set Color
            if (c.equalsIgnoreCase("red")) g.setColor(Color.red);
            else if (c.equalsIgnoreCase("blue")) g.setColor(Color.blue);
            else g.setColor(Color.green); // Default to green

            // 3. Draw (x, y, width, height)
            g.fillOval(50, 100, r * 2, r * 2);

        } catch (Exception ex) {
            // If the user types "abc" instead of numbers, do nothing
        }
    }
}
