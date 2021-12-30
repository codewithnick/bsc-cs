import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="StudentResume" width=500 height=600>
</applet> */

public class StudentResume extends Applet implements ActionListener, ItemListener {
    TextField txtname, txtaddr;
    Button btnsubmit, btnreset;
    Checkbox c1, c2, c3, c4, m, f;
    CheckboxGroup cbg;
    List l1;
    TextArea txt;
    Label lblname, lbladdr, lblgender, lbllang, lblhobbies;

    public void init() {

        setLayout(null);
        lblname = new Label("Name");
        lblname.setBounds(0, 0, 50, 50);
        add(lblname);
        txtname = new TextField(20);
        txtname.setBounds(130, 10, 150, 20);
        add(txtname);

        lbladdr = new Label("Address");
        lbladdr.setBounds(0, 40, 70, 50);
        add(lbladdr);
        txtaddr = new TextField(20);
        txtaddr.setBounds(130, 50, 150, 20);
        add(txtaddr);

        lblgender = new Label("Gender");
        lblgender.setBounds(0, 80, 70, 50);
        add(lblgender);
        cbg = new CheckboxGroup();
        m = new Checkbox("Male", false, cbg);
        m.setBounds(130, 90, 75, 20);
        add(m);
        m.addItemListener(this);
        f = new Checkbox("Female", false, cbg);
        f.setBounds(225, 90, 75, 20);
        add(f);
        f.addItemListener(this);
        lblhobbies = new Label("Hobbies");
        lblhobbies.setBounds(0, 120, 70, 50);
        add(lblhobbies);
        c1 = new Checkbox("Reading");
        c1.setBounds(80, 130, 100, 20);
        add(c1);
        c1.addItemListener(this);
        c2 = new Checkbox(" Singing");
        c2.setBounds(180, 130, 130, 20);
        add(c2);
        c2.addItemListener(this);
        c3 = new Checkbox("Dancing");
        c3.setBounds(310, 130, 130, 20);
        add(c3);
        c3.addItemListener(this);
        c4 = new Checkbox("Cooking");
        c4.setBounds(450, 130, 130, 20);
        add(c4);
        c4.addItemListener(this);
        lbllang = new Label("Programming Languages Known");
        lbllang.setBounds(0, 160, 120, 50);
        add(lbllang);
        l1 = new List(4, true);
        l1.add("C");
        l1.add("C++");
        l1.add("JAVA");
        l1.add("PHP");
        l1.add("JAVASCRIPT");
        l1.setBounds(130, 170, 150, 80);
        add(l1);

        btnsubmit = new Button("SUBMIT");
        btnsubmit.setBounds(150, 280, 70, 20);
        add(btnsubmit);
        btnsubmit.addActionListener(this);
        btnreset = new Button("RESET");
        btnreset.setBounds(300, 280, 70, 20);
        add(btnreset);
        btnreset.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
    //http://java2programming1.blogspot.com/2012/06/prgram-for-student-registration-form.html
}