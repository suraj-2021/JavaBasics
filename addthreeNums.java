import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class ThreeNumbers extends Applet implements ActionListener{
    TextField tn1,tn2,tn3;
    String result_string= "";
    
    public void init(){
        tn1 = new TextField(3);
        tn2 = new TextField(3);
        tn3 = new TextField(3);
        
        add(new Label("First Number: "));add(tn1);
        add(new Label("Second Number: "));add(tn2);
        add(new Label("Third Number: "));add(tn3);
        
        Button b = new Button("Add 3 Numbers");
        
        add(b);
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        try{
            double a = Double.parseDouble(tn1.getText());
            double b = Double.parseDouble(tn2.getText());
            double c = Double.parseDouble(tn3.getText());
            
            double result = a+b+c;
            
            result_string = "The Result Is:"+result;
            
            repaint();
        } catch(Exception e){
            System.out.println("Exception Occured!");
        }
    }
    
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString(result_string,50,150);
    }
    
}
