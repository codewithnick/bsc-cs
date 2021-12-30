import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Calculator" width=250 height=150>
</applet>
*/
public class Calculator extends Applet implements ActionListener {
    double num1, num2, res;
    TextField n1, n2, re;
    Label n11, n22, re1;
    Checkbox sum, sub, mul, div;
    Button calc;
    public void init()
     {
        n11 = new Label("FIRST NUMBER:");
        n22 = new Label("SECOND NUMBER:");
        re1 = new Label("RESULT:");
        n1 = new TextField(20);
        n2 = new TextField(20);
        re = new TextField(20);
        sum = new Checkbox("+");
        sub = new Checkbox("-");
        mul = new Checkbox("*");
        div = new Checkbox("/");
        calc =new Button("calculate");
        add(n11);
        add(n1);
        add(n22);
        add(n2);
        add(re1);
        add(re);
        add(sum);
        add(sub);
        add(mul);
        add(div);
        add(calc);
        calc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(n1.getText());
                num2 = Double.parseDouble(n2.getText());
                res = num1 + num2;
                re.setText(Double.toString(res));
            }
        });

       
    }
    public void actionPerformed(ActionEvent e) {}
}
