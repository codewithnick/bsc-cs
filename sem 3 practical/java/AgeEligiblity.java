import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AgeEligiblity extends Applet implements ActionListener{
    TextField Age;
    Label a;
    public void init(){
        a=new Label("ENTER YOUR AGE:");
        Age=new TextField(20);
        add(a);
        add(Age);
        setForeground(Color.blue);
        Age.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        repaint();
    }
    public void paint(Graphics g){
        int a;
        a=Integer.parseInt(Age.getText());
        if(a>=18){
            g.drawString("ELIGIBLE",40,50);
        }
        else{
            g.drawString("NOT ELIGIBLE",40,50);
        }
    }
}