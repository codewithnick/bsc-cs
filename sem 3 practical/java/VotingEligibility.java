import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="VotingEligibility" width=250 height=120>
</applet>
*/
public class VotingEligibility extends Applet implements ActionListener {
    TextField age;
    Label lblage;
    public void init() {
        lblage = new Label("Enter your age:");
        age = new TextField(20);
        add(lblage);
        add(age);
        setBackground(Color.black);
        setForeground(Color.white);
        age.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    public void paint(Graphics g) {
        int numage;
        numage = Integer.parseInt(age.getText());
        if (numage >= 18) {
            g.drawString("You are eligible to vote", 20, 70);
        } else {
            g.drawString("You are not eligible to vote", 20, 70);
        }
    }
}