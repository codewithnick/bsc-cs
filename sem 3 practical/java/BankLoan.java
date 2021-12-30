import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Choice;

/*
<applet code="BankLoan" width=200 height=200>
</applet>
*/
public class BankLoan extends Applet implements ActionListener, ItemListener {
	TextField txtamt;
	Checkbox five, ten, fifteen;
	public void init() {
		Label lblamt = new Label("ENTER THE TOTAL AMOUNT", Label.RIGHT);
		txtamt = new TextField(10);
		five = new Checkbox("5");
		ten = new Checkbox("10");
		fifteen = new Checkbox("15");
		add(lblamt);
		add(txtamt);
		add(five);
		add(ten);
		add(fifteen);
		txtamt.addActionListener(this);
		five.addItemListener(this);
		ten.addItemListener(this);
		fifteen.addItemListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		repaint();
	}
	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	public void paint(Graphics g) {
		double interest = 0.0;
		g.drawString("Your Principal Amt is: " + txtamt.getText(), 20, 100);
		int amt = Integer.parseInt(txtamt.getText());
		if(five.getState() == true) {
			interest = (amt * 5 * 7.8) / 100;
		}
		if(ten.getState() == true) {
			interest = (amt * 10 * 7.9) / 100;
		}
		if(fifteen.getState() == true) {
			interest = (amt * 15 * 9.8) / 100;
		}
		g.drawString("Your Interest Amt is: " + interest, 20, 120);
		g.drawString("Your monthly Interest Amt is: " + interest/12, 20, 140);
	}
}