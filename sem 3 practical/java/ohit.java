import java.util.Random;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="ohit.class" width=600 height=600>
</applet> */

public class ohit extends Applet implements ActionListener, ItemListener {

    TextField t3, t4, t5, t6, t7;
    Button b1, b2;
    Checkbox c1, c2, c3, c4, m, f;
    CheckboxGroup cbg;
    List l1;
    Label l2, l3, l4, l5;
    TextArea tx1;

    public void init() {
        setLayout(null);
        l5 = new Label("LOCATION");
        l5.setBounds(0, 120, 70, 50);
        add(l5);
        c1 = new Checkbox("MUMBAI");
        c1.setBounds(80, 130, 100, 20);
        add(c1);
        c1.addItemListener(this);
        c2 = new Checkbox("PUNE");
        c2.setBounds(180, 130, 130, 20);
        add(c2);
        c2.addItemListener(this);
        l5 = new Label("THEATERS");
        l5.setBounds(0, 160, 120, 50);
        add(l5);
        l1 = new List(4, true);
        l1.add("INOX");
        l1.add("PVR");
        l1.add("MAXUS");
        l1.add("CINEMA");
        l1.add("EVERGREEN");
        l1.setBounds(130, 170, 150, 80);
        add(l1);
        b1 = new Button("SUBMIT");
        b1.setBounds(150, 280, 70, 20);
        add(b1);
        b1.addActionListener(this);
        b2 = new Button("RESET");
        b2.setBounds(300, 280, 70, 20);
        add(b2);
        b2.addActionListener(this);
        tx1 = new TextArea("", 10, 20, TextArea.SCROLLBARS_BOTH);
        tx1.setBounds(0, 350, 600, 100);
        add(tx1);

    }
    public void paint(Graphics g){
       
    }
    String selections[];
    public void actionPerformed(ActionEvent e) {
        Random rn = new Random();
        int range = 12 - 1 + 1;
        int randomNum =  rn.nextInt(range) + 1;
        repaint();
        if (e.getSource() == b1) {
            //SUBMIT
            selections=l1.getSelectedItems();
            tx1.insert("showtimes for "+selections[0], 0);
            tx1.insert( "\n", 0);
            tx1.insert("baaghi: "+ (rn.nextInt(range) + 1)+":00 AM \n",0);
            tx1.insert("ddlj: "+ (rn.nextInt(range) + 1)+":00 PM \n",0);
        }

        String msg = new String("");
        if (e.getSource() == b2) {
            //RESET
            tx1.setText(msg);
           
        }
    }
    public void itemStateChanged(ItemEvent e) {
        //checkbox
        tx1.setText("");
        tx1.insert(" in "+((Checkbox) e.getItemSelectable()).getLabel() + " theaters", 0);

    }
}