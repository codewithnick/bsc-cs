import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Form" width=250 height=150>
</applet>
*/
public class Form extends Applet implements ActionListener {
    TextField n1, n2,re1;
    Label n11, n22;
    Button btn;
    public void init()
    {
        n1= new TextField(20);
        n2= new TextField(20);
        n11 = new Label("USERNAME");
        n22 = new Label("PASSWORD");
        btn = new Button("SUBMIT");
        add(n11);
        add(n1);
        add(n22);
        add(n2);
        add(btn);
        n1.addActionListener(this);
        n2.addActionListener(this);
       

            
    }
    public void actionPerformed(ActionEvent ae) {
		repaint();
    }
    public void paint(Graphics g) {
		if(n1.getText()=="admin" && n2.getText()=="admin"){
            g.drawString("welcome" , 50, 130);
        }
        else if(n1.getText()!="admin" && n2.getText()!="admin"){
            g.drawString("error"+n1.getText()+n2.getText() , 50, 130);
        }
        else {
            g.drawString("enter text" , 50, 130);
        }
	}

}